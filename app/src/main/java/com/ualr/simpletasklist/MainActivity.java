package com.ualr.simpletasklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ualr.simpletasklist.databinding.ActivityMainBinding;
import com.ualr.simpletasklist.model.Task;
import com.ualr.simpletasklist.model.TaskList;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final TaskList taskList = new TaskList(new HashMap<Integer, Task>());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        this.binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddBtnCLicked();
            }
        });


        this.binding.deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDeleteBtnClicked();
            }
        });


        this.binding.clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDoneBtnClicked();
            }
        });
    }


    private void onAddBtnCLicked() {
        this.taskList.add(this.binding.editTextTextPersonName.getText().toString());
        this.binding.taskList.setText(this.taskList.toString());
    }


    private void onDeleteBtnClicked() {
        this.taskList.delete(Integer.parseInt(this.binding.editTextTaskId.getText().toString()));
        this.binding.taskList.setText(this.taskList.toString());
    }


    private void onDoneBtnClicked() {
        this.taskList.markDone(Integer.parseInt(this.binding.editTextTaskId.getText().toString()));
        this.binding.taskList.setText(this.taskList.toString());
    }

}