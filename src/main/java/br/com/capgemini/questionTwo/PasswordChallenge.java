package br.com.capgemini.questionTwo;

public class PasswordChallenge {

    public int passwordChecker(final String password){
        boolean hasNumber=false;
        boolean hasLowerCaseLetter=false;
        boolean hasUpperCaseLetter=false;
        boolean hasSpecialCharacter=false;
        int missingCharacters=0;
        String specialCharacters="!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            char letter= password.charAt(i);
            if(Character.isUpperCase(letter)){
                hasUpperCaseLetter=true;
            } else if(Character.isLowerCase(letter)){
                hasLowerCaseLetter=true;
            } else if(Character.isDigit(letter)){
                hasNumber=true;
            } else if (specialCharacters.contains(String.valueOf(letter))){
                hasSpecialCharacter=true;
            }
        }
        missingCharacters = (hasUpperCaseLetter ? 0 : 1) +
                (hasLowerCaseLetter ? 0 : 1) +
                (hasNumber ? 0 : 1) +
                (hasSpecialCharacter ? 0 : 1);


        if(password.length() + missingCharacters<6){
            missingCharacters =6-password.length();
        }
        return missingCharacters;
    }

    public int passwordCheckerUsingRegex(final String password){

        int missingCharacters;
        String specialCharacters="^.*[!@#$%^&*()-+].*$";
        String upperCaseLetters="^.*[A-Z].*$";
        String lowerCaseLetters="^.*[a-z].*$";
        String numbers="^(?=.*\\d).*$";

        boolean hasNumber = password.matches(numbers);
        boolean hasLowerCaseLetter = password.matches(lowerCaseLetters);
        boolean hasUpperCaseLetter = password.matches(upperCaseLetters);
        boolean hasSpecialCharacter = password.matches(specialCharacters);

        missingCharacters = (hasUpperCaseLetter ? 0 : 1) +
                (hasLowerCaseLetter ? 0 : 1) +
                (hasNumber ? 0 : 1) +
                (hasSpecialCharacter ? 0 : 1);


        if(password.length() + missingCharacters < 6){
            missingCharacters = 6 - password.length();
        }
        return missingCharacters;
    }

}
