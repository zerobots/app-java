#! /bin/bash

# Setup java home
export JAVA_HOME=/usr/lib/jvm/java-1.7.0

# Setup maven
export M2_HOME={{maven_home}}
export M2=$M2_HOME/bin 

# Setup path
export PATH=$M2:$PATH 

export db_username={{db_username}}
export db_password={{db_password}}
export db_name={{db_name}}