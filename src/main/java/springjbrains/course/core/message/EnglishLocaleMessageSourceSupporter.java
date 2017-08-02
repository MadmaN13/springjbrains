package springjbrains.course.core.message;

import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * Created by NM.Rabotaev on 01.08.2017.
 */
public class EnglishLocaleMessageSourceSupporter {

    private final String notFoundIdMessage = "Id for message not found in message source file!";

    private MessageSource messageSource;
    public EnglishLocaleMessageSourceSupporter(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    protected MessageSource getMessageSource() {
        return messageSource;
    }

    protected String getMessage(String code) {
        return messageSource.getMessage(code, null, notFoundIdMessage, Locale.ENGLISH);
    }
    protected String getMessage(String code, Object[] params) {
        return messageSource.getMessage(code, params, notFoundIdMessage, Locale.ENGLISH);
    }

}
