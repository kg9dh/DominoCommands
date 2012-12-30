DominoCommands
==============
Config setup:

Example:
------------------
commandlist:
  - help
  - say
commands:
  help: say hello
  say: say say
------------------
in the "commandlist:" you put every command you want to have as trigger, 
the plugin uses this to recognize the commands in the "commands:" section

in the "commands:" section you can add as many commands as you want and use them as trigger for
other commands

help & say are the commands which trigger the commands "/say hello" and "/say say". 
Remember: You dont need to add a "/", otherwise the command will fail

you cant replace commands with arguments atm, I could look for a way so it works, but this would take some more time
--> TODO list ;)
