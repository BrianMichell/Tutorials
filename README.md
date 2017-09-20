# Tutorials

In these tutorials I will try to explain everything throughly. If I missed anything or you need clarification on anything, please contact me.

Variables

  Why variables?
  
    Variables are useful when you do not know something for sure or you intend to change the data at a later date. 
  How does this help me?
    Variables can be used for things such as the heading of the robot, or what position the pneumatics are in at that moment.
    
Constants

  Why constants?
  
    Constants are extremely handy when you know something will not change. Making something a constant means you don't have to worry about it
    being changed by rogue code (or a rogue programmer) randomly in your program.
    
  How does this help me?
  
    Constants are used for things such as the field dimensions.
    
Types of loops

  While loops
  
    While loops look at a boolean expression before determining if it should execute a piece of code. If the boolean expression it true
    the code inside will be run until the expression becomes false. After it becomes false it does not matter if it changes at a later time.
    The code inside will not be run anymore.
    
    While loops are useful for when you are unsure of when something will end, if ever.
  For loops
  
    For loops are composed of 3 parts. The first part is the variable. The variable does not have to be declared inside the loop, but it does
    have to be declared. The second part is the boolean expression that will end them. Much like a while loop, for loops will run until their 
    boolean expression changes. Unlike while loops, for loops terminate when their expression becomes true. The third part is how the loop will
    alter the variable. After each time the for loop is run it will execute the thrid part, and then check the second part. As long as the second
    part (the boolean expression) is false, the code will run again. As soon as the boolean expression becomes true, the code exits.
    
      Try it: Print out the value of i inside the loop. Is it what you expected?
      
Objects

  Why objects?
  
    Objects are useful because they are reusable bits of code that you (mostly) know will work. Most packages have been throughly tested
    to make sure they are robust, so you can feel confident that they will work.
    
  How does this help me?
  
    Most of your robotics programming will be done using objects created from the WPI libraries. This includes things such as motor controllers,
    sensors, and joysticks.
    
Output

  Why should I output?
  
    Sometimes it is hard to tell what your program is doing and you need to see what's going on. It can help you see if code is reaching
    a certian point or if variables are changing in the way that you would expect. It would suprise you how things don't work the same way in the 
    computer as they do in your head.
