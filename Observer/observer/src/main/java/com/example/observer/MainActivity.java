package com.example.observer;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


        // Observer Client

		/*
		 * Observer - The observer pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are
		 * notified and updated automatically.
		 */


        /*
        SubjectNumber1 implements Subject, and has a list of observers,a message, and bool whether it has changed.
        It takes a list of observers to construct itself.
        It can post a message, which adjusts certain parameters and then calls notifyObservers() method implemented via Subject.
        It can "REGISTER" new observers.

        Subject, an INTERFACE which contains the boiler plate methods for register,unregister, notifyObservers, and getUpdates.

        Observer, another INTERFACE that contains boiler plate code for update, and setSubject().

        ObserverOfSubjectNumber1, implements Observer, it has a name and a subject, and it takes a name string as a constructor parameter.
        It overrides and customizes the update and setSubject methods of the Observer.


         */

		//create subject
		SubjectNumber1 subjectNumber1 = new SubjectNumber1();

		//create observers
		Observer observer1 = new ObserverOfSubjectNumber1("Observer 1");
		Observer observer2 = new ObserverOfSubjectNumber1("Observer 2");
		Observer observer3 = new ObserverOfSubjectNumber1("Observer 3");

		//register observers to the subject
		subjectNumber1.register(observer1);
		subjectNumber1.register(observer2);
		subjectNumber1.register(observer3);

		//attach observer to subject
		observer1.setSubject(subjectNumber1);
		observer2.setSubject(subjectNumber1);
		observer3.setSubject(subjectNumber1);

		//check if any update is available
		observer1.update();

		//now send message to subject
		subjectNumber1.postMessage("New Message");
	}

}
