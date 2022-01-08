package hazırlık;

public class Top30GitCommands {
/*	Top 30 Git Commands 
	====================
	​
	​
	Git is the most popular distributed version control system in the world.Linus Torvalds, the creator of the Linux kernel, built this tool way back in 2005, which is currently an actively maintained open-source project. A huge number of open-source and commercial projects rely on Git for version control.
	​
	In this article, I will list the most essential commands which you should know as a developer and become a master in handling your GitHub repositories. Beginners and experienced developers can benefit from this article.
	​
	​
	1.  Set Up Your Username and Email
	2.  Cache Your Login Credentials
	3.  Initialize a Repository
	4.  Add Individual File or All Files To Staging Area
	5.  Check a Repository Status
	6.  Commit Changes With a Single Line Message or Through an Editor
	7.  View Commit History With Changes
	8.  View a Particular Commit
	9.  View Changes Before Committing
	10. Remove Tracked Files From The Current Working Tree
	11. Rename Files
	12. Revert Unstaged and Staged Changes
	13. Amend The Most Recent Commit
	14. Rollback Last Commit
	15. Rollback a Particular Commit
	16. Create and Switch To a New Branch
	17. List All Branches
	18. Delete a Branch
	19. Merge Two Branches
	20. Show Commit Log as Graph For Current or All Branches
	21. Abort a Conflicting Merge
	22. Add a Remote Repository
	23. View Remote URLs
	24. Get Additional Information About a Remote Repository
	25. Push Changes To a Remote Repository
	26. Pull Changes From a Remote Repository
	27. Merge Remote Repository With Local Repository
	28. Push a New Branch To Remote Repository
	29. Remove a Remote Branch
	30. Use Rebase
	​
	1. Set Up Your Username and Email 
	=================================
	​
	The username is required to link commits with your name. It is not the same as your GitHub account username, which you use to login into your GitHub profile. You can set or update your username by using the `git config` command. The new name will automatically reflect in any future commits that you push to GitHub from the command line. If you want to hide your real name, you can use any arbitrary text as your Git username.
	​
	``` bash
	git config --global user.name "user.name"
	```
	​
	You can also use the `git config` command to update the email address that you want to associate with your Git commits. The new email address will automatically reflect in any future
	commits that you push to GitHub from the command line.
	​
	```bash 
	git config --global user.email "user.email"
	```
	​
	2. Cache Your Login Credentials
	===============================
	​
	You can cache your login credentials by using the `config` parameter and `--global` flag. It helps to avoid re-typing the username and password every time you perform a commit.
	​
	```bash
	git config --global credential.helper cache
	```
	​
	3. Initialize a Repository 
	==========================
	​
	You can create an empty Git repository or reinitialize an existing one by using the `init` parameter. It will create a hidden directory upon initialization. This directory contains all the objects and references that Git uses and creates as a part of your project's history.
	​
	```bash
	git init
	```
	​
	4. Add Individual File or All Files To Staging Area 
	===================================================
	​
	You can add a single file to the staging area by using the `add` parameter and the name of the file. Just replace the `somefile.js` with your filename.
	​
	```bash
	git add somefile.js
	```
	​
	You can also add all files and directories to the staging area by providing the wildcard `.` instead of the file name.
	​
	```bash
	git add .
	```
	​
	5. Check a Repository Status 
	============================
	​
	You can view the status of the current repository by using the `status` keyword, which includes the staged, unstaged, and untracked files.
	​
	```bash
	git status
	```
	​
	6. Commit Changes With a Single Line Message or Through an Editor 
	=================================================================
	​
	You can add a single line message while making a commit in your repository by using the `commit` parameter, and `-m` flag. This message should immediately follow the flag and be wrapped in quotation marks.
	​
	```bash
	git commit -m "Your short summary about the commit"
	```
	​
	You can also open a text editor in the terminal to write a complete commit message. This message can contain multi-line text to allow you to explain the changes made to a repository in a detailed way.
	​
	```bash
	git commit
	```
	​
	7. View Commit History With Changes 
	===================================
	​
	You can view the changes made in your repository by using the `log` parameter. It will show a list of the newest commits in sequential order. You can also check the detailed changes of each
	file by adding the `-p` flag.
	​
	```bash
	git log -p
	```
	​
	8. View a Particular Commit 
	===========================
	​
	You can see the detailed changes of a specific commit by using the `show` parameter and providing the ID or hash of the commit. This hash is unique for each commit made in your repository.
	​
	```bash
	git show 1af17e73721dbe0c40011b82ed4bb1a7dbe3ce29
	```
	​
	You can also provide a short hash to get the same result.
	​
	```bash
	git show 1af17e
	```
	​
	9. View Changes Before Committing 
	=================================
	​
	You can view the list of changes made to your repository by using the `diff` parameter. It will only show the unstaged changes by default.
	​
	```bash
	git diff
	```
	​
	If you want to view the staged changes, you can add the `--staged` flag.
	​
	```bash
	git diff --staged
	```
	​
	You can also provide a filename as a parameter to only view the changes
	of a specific file.
	​
	```bash
	git diff somefile.js
	```
	​
	10. Remove Tracked Files From The Current Working Tree
	======================================================
	​
	You can remove files from the current working tree by using the `rm` parameter. This action will also remove the files from the index.
	​
	```bash
	git rm dirname/somefile.js
	```
	​
	You can also provide file globs (e.g., \*.js) to remove all matching files. 
	​
	```bash
	git rm dirname/*.html
	```
	​
	11. Rename Files 
	================
	​
	You can rename a file or directory by using the `mv` parameter. This parameter requires a `<source>` and a `<destination>`. The source must exist and can be a file, or directory, and the destination must be an existing directory.
	​
	```bash
	git mv dir1/somefile.js dir2
	```
	​
	Executing the above command will move the source(s) into the target directory. The index will get updated, but you have to commit the changes.
	​
	12. Revert Unstaged and Staged Changes 
	======================================
	​
	You can restore the unstaged working tree files by using the `checkout` parameter. You need to provide a file path to update it. If the file path is not set, then `git checkout` will update the HEAD to set the specified branch as the current branch.
	​
	```bash
	git checkout somefile.js
	```
	​
	To restore a staged working tree file, you can use the `reset parameter. You need to provide a file path to remove it from the staging area. This will not remove any changes or modifications done to the files, instead, the file will be considered as an unstaged file.
	​
	```bash
	git reset HEAD somefile.js
	```
	​
	If you want to unstage all staged files, then do not provide the file path.
	​
	```bash
	git reset HEAD
	```
	​
	13. Amend The Most Recent Commit 
	================================
	​
	You can make changes to the most recent commit by using the `commit` parameter with the `--amend` flag. For instance, you just committed some files, and you remember that you have made a mistake in your commit message. In such a scenario, you can execute this command to edit the previous commit's message without modifying its snapshot.
	​
	```bash
	git commit --amend -m "Updated message for the previous commit"
	```
	​
	It is also possible to make changes to the previously committed files. For instance, you have updated some files in multiple folders that you folder to commit. Fixing this sort of error is just a matter of staging the other files or folders, and committing with the `--amend` and `--no-edit` flags.
	​
	```bash
	git add dir1
	git commit
	# Here you forgot to add dir2 to commit, you can execute the following command to amend the other files and folders.git add dir2
	git commit --amend --no-edit
	```
	​
	The `--no-edit` flag will allow you to make the correction to your commit without altering its commit message. The final commit will then replace the incomplete one, and it will look like we
	have committed the changes to all updated files and folders in one snapshot.
	​
	> **Alert !!! Don't amend public commits.\
	> **Correcting a local commit with amend is excellent, and you are
	> allowed to push it to a shared repository. But you should avoid
	> amending commits that are already public. Remember that the amended
	> commits are completely new commits, and the previous commit will not
	> be available on your current branch. It has the same consequence as
	> resetting a public snapshot.
	​
	​
	14. Rollback Last Commit
	========================
	​
	You can roll back the last commit by using the `revert` parameter. This will create a new commit, an inverse of the previous commit, and add it to the current branch history.
	​
	```bash
	git revert HEAD
	```
	​
	Revert v/s Reset 
	----------------
	​
	The `git revert`command only undoes a single commit. It does not move back to the previous state of a project by removing all succeeding commits, which is done when `git reset` is used.
	​
	Reverting has two major benefits over resetting. First, it doesn't alter the project history, which makes it a safe operation for commits.
	Second, it is able to target a specific commit at any point in the history, whereas git reset can only work backwards from the current commit. For instance, if you want to undo an old commit with git reset, you would have to remove all the commits that occurred after the target commit, then re-commit all the subsequent commits. Thus, the `git revert` is a much better and safer way to undo the changes.
	​
	15. Rollback a Particular Commit 
	================================
	​
	You can roll back to a particular commit by using `revert` parameter and the commit ID. It will create a new commit, a copy of the provided commit ID, and add it to the current branch
	history.
	​
	```bash
	git revert 1af17e
	```
	​
	16. Create and Switch To a New Branch 
	=====================================
	​
	You can create a new branch by using the `branch` parameter and the name of the branch.
	​
	```bash
	git branch new_branch_name
	```
	​
	But Git won't switch to it automatically. If you want Git to auto-switch, you have to pass the `-b` flag and the `checkout` parameter.
	​
	```bash
	git checkout -b new_branch_name
	```
	​
	17. List All Branches 
	=====================
	​
	You can view the list of all branches by using the `branch` parameter. It will display all branches and mark the current branch with an asterisk (*) sign and highlight it.
	​
	```bash
	git branch
	```
	​
	You can also list all remote branches by using the `-a` flag.
	​
	```bash
	git branch -a
	```
	​
	18. Delete a Branch 
	===================
	​
	You can delete a branch by using the `branch` parameter, `-d` flag and the name of the branch. If you've completed working on a branch and have merged it into the main branch, you can delete the branch without losing any history. However, if the branch hasn't been merged, the delete command will output an error message. This safeguards you from losing access to your files.
	​
	```bash
	git branch -d existing_branch_name
	```
	​
	If you want to forcibly delete a branch, you can use the capital `-D` flag. This will delete the branch despite its current status and without any warning.
	​
	```bash
	git branch -D existing_branch_name
	```
	​
	The above commands will only delete a local copy of the branch. The branch may exist in the remote repository. If you want to delete a remote branch, then execute the following command.
	​
	```bash
	git push origin --delete existing_branch_name
	```
	​
	19. Merge Two Branches 
	======================
	​
	You can merge two branches by using the `merge` parameter and the name of the branch. This will combine the specified branch into the...*/
}
