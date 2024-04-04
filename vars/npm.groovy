#!/usr/bin/env groovy
def call(){
  sh 'nvm install v20'
  sh 'node -v'
  sh 'npm install'
}
