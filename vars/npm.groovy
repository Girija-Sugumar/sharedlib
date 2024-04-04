#!/usr/bin/env groovy
def call(){
  sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash'
  sh 'source ~/.bashrc'
  sh 'nvm -v'
}
