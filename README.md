# Pollux Cipher Solver
This program solves for the plaintext message behind Pollux-encrypted user input. It does so without needing any hints to the cipher.

## Background
The Pollux Cipher is a Morse Code encryption technique. It works by converting a message to Morse Code and then substituting each Morse Code symbol with a digit. Because
there are three Morse Code symbols (dot, dash, separator) and ten digits, multiple digits can represent the same symbol.

For more information on Pollux, see this link: https://toebes.com/codebusters/Samples/Solving_Pollux.htm

## Usage
The program is written in Java, so make sure you have it installed.

To use, simply compile the provided source code and run the Main class.

When prompted, enter your Pollux-encrypted message. Be aware that Pollux ciphertext can be quite long.

```bash
Please enter a Pollux-encrypted string
150151101550120515301110011210110510311003011110100501105301001121025201510030111101005011110110510551011100501111015050052012021501003125055201150011510101013110011110120155101551021530030252003111010015015110110111501
ALWAYS FIND THE TIME FOR THE THINGS THAT MAKE YOU FEEL HAPPY TO BE ALIVE 
```
