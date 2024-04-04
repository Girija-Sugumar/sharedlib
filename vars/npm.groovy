#!/usr/bin/env groovy
def call(){
  sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash'
  sh 'export NVM_DIR="$HOME/.nvm" && [ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"'
  sh 'nvm -v'
  sh 'nvm install v20'
  sh 'npm install'
}
