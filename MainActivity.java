package com.example.tom.backendless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person(); //creates new 'PERSON' object
        person.setName("Thomas");
        person.setSurname("Sankey");

        Backendless.Data.of(Person.class).save(person, new AsyncCallback<Person>() {
            @Override
            public void handleResponse(Person response) {

            }

            @Override
            public void handleFault(BackendlessFault fault) {

            }
        });
    }
}
