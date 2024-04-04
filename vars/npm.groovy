#!/usr/bin/env groovy
def call(){
  sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash'
  sh 'nvm install 20'
  sh 'npm install'
}
