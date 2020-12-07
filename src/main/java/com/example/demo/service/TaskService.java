package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.TaskRequest;
import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
@Service
@Transactional
public class TaskService{

  @Autowired
  TaskRepository taskRepository;

  /**
   * レコードを全件取得する。
   * @return
   */
  public List<Task> findAllData(){

    return taskRepository.findAll();
  }

  /**
   * タスク情報 新規登録
   * @param task
   */
  public void create(TaskRequest taskRequest) {

    Task task = new Task();
    task.setName(taskRequest.getName());
    task.setTantosha(taskRequest.getTantosha());
    taskRepository.save(task);
  }

  /**
   * タスク情報取得
   * @param task
   */
  public Task selectById(int id)  {
    return taskRepository.findById(id).get();
  }

  /**
   * タスク情報 更新
   * @param task
   */
  public Task update(Task task) {
    return taskRepository.save(task);
  }

  /**
   * タスク情報 削除
   * @param task
   */
  public void delete(Integer id) {
    taskRepository.deleteById(id);
  }
}