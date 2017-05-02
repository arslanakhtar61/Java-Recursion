/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".

Suggestion: check the first and last chars, and then recur on what's inside them.
nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
*/

public boolean nestParen(String str)
{
	int len = str.length();
	if(len == 0)
		return true;
	if(str.charAt(0) == '(' && str.charAt(len - 1) == ')')
			return nestParen(str.substring(1, len - 1));
	return false;
}

