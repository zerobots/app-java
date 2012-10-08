Starting Development on your local machine
=========

To setup an isolated development environment with all of dependencies
setup you may use vagrant:

Vagrant Dependencies
----
* VirtualBox: https://www.virtualbox.org/wiki/Downloads
  * Version 4.1.18 (The most recent version gives a warning)
* Vagrant: http://downloads.vagrantup.com/tags/v1.0.5
  * add the ansible plugin: `[me@deploy]$ vagrant gem install vagrant-ansible`

Starting Development in Vagrant
---
* Setup your vagrant vm instance
  * `[me@deploy]$ vagrant up`
* Login to vagrant
  * `[me@deploy]$ vagrant ssh`
* Start development on your project app
  * `[vagrant@~]$ cd project/app`
  * `[vagrant@app]$ mvn package`
  * `[vagrant@app]$ java -jar target/app.war`

