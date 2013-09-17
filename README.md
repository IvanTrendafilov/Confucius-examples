Confucius-examples
==============================================

To run and modify the examples, there are a couple of prerequisites:

* your `$JAVA_HOME` variable set to a JVM >=7
* Maven >= 3 (if you want to modify the examples), git
* The launcher scripts require a Unix-like OS, but should be easy to adapt to Windows (if you'd like to contribute)

Run the examples
----------------

Just follow these steps:

```bash
$ git clone https://github.com/IvanTrendafilov/Confucius-examples.git
$ cd Confucius-examples/bin
$ ./bagel-app.sh
$ ./mailer-app.sh
```
Modify the examples
---------------

Checkout the project and import it in Eclipse (or your favourite IDE). Make the changes.

Once ready:

```bash
$ cd Confucius-examples
$ mvn package && cd bin
$ cp ../target/Confucius-examples-*.jar .
```


Contributions
---------------------------------

Please open a ticket and we will discuss.



