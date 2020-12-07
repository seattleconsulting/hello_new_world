package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.TaskRequest;
import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
@Controller
public class TaskController {
  @Autowired
  TaskService taskService;

  /**
   * タスク情報一覧画面
   * @param model
   * @return タスク情報一覧画面
   */
  @GetMapping("task")
  public String show(Model model) {

    // タスクの取得
    List<Task> taskList = taskService.findAllData();
    model.addAttribute("taskRequest", new TaskRequest());
    model.addAttribute("taskList", taskList);

    return "task";
  }

  /**
   * タスク更新画面
   * @param id 更新データID
   * @param model
   * @return タスク更新画面
   */
  @GetMapping("show/{id}")
  public String showthisone(@PathVariable Long id, Model model) {
	  int i = id.intValue();
      Task task = taskService.selectById(i);
      model.addAttribute("task", task);
      return "edit";
  }

  /**
   * タスク更新
   * @param id 更新データID
   * @param task 更新タスク
   * @return タスク情報一覧画面
   */
  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  public String update(@PathVariable Long id, @ModelAttribute Task task) {
	  int i = id.intValue();
      task.setId(i);
      taskService.update(task);
      return "redirect:/task";
  }

  /**
   * タスク新規登録
   * @param taskRequest リクエストデータ
   * @return タスク情報一覧画面
   */
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public String create(@ModelAttribute TaskRequest taskRequest) {
     // タスクの登録
      taskService.create(taskRequest);
      return "redirect:/task";
  }

  /**
   * タスク削除
   * @param taskRequest リクエストデータ
   * @return タスク情報一覧画面
   */
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public String delete(@ModelAttribute TaskRequest taskRequest) {
     // タスクの更新
      taskService.delete(taskRequest.getId());
      return "redirect:/task";
  }

}