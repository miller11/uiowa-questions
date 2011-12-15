Exercise 2
==========

For this exercise we would like you to design a class that can be used
to take measurements and report back information on them over different
time periods.  Assume this is used to record events and the time they 
happened, and then can be used by a reporting tool to show meters or 
graphs of the data over different time periods.

This class should handle the following design goals:

   - it might have to handle a large number of events
   - we care more about recent data, then older data
   - recording an event should be as fast as possible, views can be slower

There are two files in this directory:

*MeteredList.java*

- Implement your MeteredList class in this file.  It is currently empty

*MeteredListTest.java*

- fill out the implementation of the test methods that are defined
  in this class.  We have named various test methods that we would
  like you to implement to test out your class

You do not have to go through the trouble of actually installing TestNG and
running the test (this isn't an exercise in installing TestNG) - just write 
out the code.

Here are the requirements we expect of your MeteredList class:

- the list should have a method called mark() which records the timestamp
  that an event happened (with millisecond accuracy).  you can create a
  secondary mark() method which takes a timestamp if it helps you with
  testing.

- you should keep a total count of the number events since the object was
  created.

- you should provide methods that return event totals over 1) the past minute, 
  2) the past 15 minutes, and 3) the past hour.  Simple counts are fine, we
  are not looking for weighted averages, or anything like that.

- you should provide methods that return data streams that could be fed into
  a graphing program that would graph requests per minute for: 1) the past 
  hour, 2) the past 4 hours, and 3) the past day.

- we don't care about data more than a day old.


You can make assumptions, just explain them briefly.

