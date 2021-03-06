package com.data.dangtuan.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtils {

  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
  private static EmailUtils emailUtils;
  private Pattern pattern;
  private Matcher matcher;

  private EmailUtils() {
    pattern = Pattern.compile(EMAIL_PATTERN);
  }

  public synchronized static EmailUtils getEmailUtilsInstance() {
    if (emailUtils == null) {
      emailUtils = new EmailUtils();
    }
    return emailUtils;
  }

  /**
   * Validate hex with regular expression
   *
   * @param hex hex for validation
   * @return true valid hex, false invalid hex
   */
  public boolean validate(final String hex) {
    matcher = pattern.matcher(hex);
    return matcher.matches();

  }
}
