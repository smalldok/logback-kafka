package com.github.ptgoetz.logback.kafka;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import com.github.ptgoetz.logback.kafka.formatter.Formatter;
import com.github.ptgoetz.logback.kafka.formatter.MessageFormatter;

/**
 * Created by jialing.yao on 2016-9-5.
 */
public class SampleAppender extends AppenderBase<ILoggingEvent> {
    private Formatter formatter;
    public Formatter getFormatter() {
        return formatter;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }
    @Override
    public void start() {
        if (this.formatter == null) {
            this.formatter = new MessageFormatter();
        }
        super.start();
    }
    @Override
    public void stop() {
        super.stop();
    }
    protected void append(ILoggingEvent iLoggingEvent) {
        String payload = this.formatter.format(iLoggingEvent);
        System.out.println("卧槽===="+payload);
    }
}
