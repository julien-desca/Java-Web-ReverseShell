# Java-Web-ReverseShell
Java WebServeur Reverse Shell

A war-ready reverse shell to deploy on Java EE application server

## usage

1.
`mvn clean install` to compile the war


2. `nc -lvp 4444` for listening the connection


3. deploy on the web serveur & go to <deploy_path>/shell


4. enjoy your shell

## Notes

Original shell code found [here](https://github.com/swisskyrepo/PayloadsAllTheThings/blob/master/Methodology%20and%20Resources/Reverse%20Shell%20Cheatsheet.md#java)

adapted for the vulhub machine 'My tomcat host' [vulhub link](https://www.vulnhub.com/entry/my-tomcat-host-1,457/)
