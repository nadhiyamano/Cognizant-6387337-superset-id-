# GitDemo Project

## Objectives
- Learn basic Git commands: git init, git status, git add, git commit, git push, git pull
- Set up Git with user configuration
- Set Notepad++ as the default Git editor
- Create a local repository and push it to a remote GitLab repository

## Commands Used
```bash
# Check Git version
git --version

# Configure Git
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

# Set Notepad++ as default editor
git config --global core.editor "notepad++"

# Create Git repository
git init

# Create file and check status
echo "Welcome to Git hands-on lab." > welcome.txt
git status

# Add and commit the file
git add welcome.txt
git commit -m "Initial commit with welcome.txt"

# Push to remote
git remote add origin https://gitlab.com/yourusername/GitDemo.git
git push -u origin master
```
