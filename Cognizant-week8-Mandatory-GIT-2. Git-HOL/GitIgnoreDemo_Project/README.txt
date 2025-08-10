# GitIgnoreDemo Project

## Objectives
- Understand `.gitignore` usage
- Ignore `.log` files and `log/` folders from Git tracking

## Commands Used
```bash
# Initialize git repo
git init

# Create files
echo "This is a log file that should be ignored by Git." > debug.log
mkdir log
echo "This file is inside the log folder and should also be ignored." > log/logfile.txt

# Create .gitignore
echo "*.log" >> .gitignore
echo "log/" >> .gitignore

# Check git status
git status
```

## Expected Output
- `debug.log` and `log/` should NOT be listed as untracked files.
