/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * Performs a query, poll, insert, update or delete in a relational database
 * using MyBatis.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MyBatisEndpointBuilder {


    public static class MyBatisCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        MyBatisCommonBuilder(String path) {
            super("mybatis", path);
        }
        /**
         * The statement name in the MyBatis XML mapping file which maps to the
         * query, insert, update or delete operation you wish to evaluate. The
         * option is a java.lang.String type.
         */
        public T statement(String statement) {
            this.properties.put("statement", statement);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a boolean type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a boolean type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class MyBatisConsumerBuilder
            extends
                MyBatisCommonBuilder<MyBatisConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public MyBatisConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public MyBatisConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a boolean type.
         */
        public MyBatisConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * This option is intended to split results returned by the database
         * pool into the batches and deliver them in multiple exchanges. This
         * integer defines the maximum messages to deliver in single exchange.
         * By default, no maximum is set. Can be used to set a limit of e.g.
         * 1000 to avoid when starting up the server that there are thousands of
         * files. Set a value of 0 or negative to disable it. The option is a
         * int type.
         */
        public MyBatisConsumerBuilder maxMessagesPerPoll(int maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * This option is intended to split results returned by the database
         * pool into the batches and deliver them in multiple exchanges. This
         * integer defines the maximum messages to deliver in single exchange.
         * By default, no maximum is set. Can be used to set a limit of e.g.
         * 1000 to avoid when starting up the server that there are thousands of
         * files. Set a value of 0 or negative to disable it. The option will be
         * converted to a int type.
         */
        public MyBatisConsumerBuilder maxMessagesPerPoll(
                String maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Statement to run after data has been processed in the route. The
         * option is a java.lang.String type.
         */
        public MyBatisConsumerBuilder onConsume(String onConsume) {
            this.properties.put("onConsume", onConsume);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Whether allow empty resultset to be routed to the next hop. The
         * option is a boolean type.
         */
        public MyBatisConsumerBuilder routeEmptyResultSet(
                boolean routeEmptyResultSet) {
            this.properties.put("routeEmptyResultSet", routeEmptyResultSet);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Whether allow empty resultset to be routed to the next hop. The
         * option will be converted to a boolean type.
         */
        public MyBatisConsumerBuilder routeEmptyResultSet(
                String routeEmptyResultSet) {
            this.properties.put("routeEmptyResultSet", routeEmptyResultSet);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public MyBatisConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a boolean type.
         */
        public MyBatisConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Enables or disables transaction. If enabled then if processing an
         * exchange failed then the consumer break out processing any further
         * exchanges to cause a rollback eager. The option is a boolean type.
         */
        public MyBatisConsumerBuilder transacted(boolean transacted) {
            this.properties.put("transacted", transacted);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Enables or disables transaction. If enabled then if processing an
         * exchange failed then the consumer break out processing any further
         * exchanges to cause a rollback eager. The option will be converted to
         * a boolean type.
         */
        public MyBatisConsumerBuilder transacted(String transacted) {
            this.properties.put("transacted", transacted);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Process resultset individually or as a list. The option is a boolean
         * type.
         */
        public MyBatisConsumerBuilder useIterator(boolean useIterator) {
            this.properties.put("useIterator", useIterator);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Process resultset individually or as a list. The option will be
         * converted to a boolean type.
         */
        public MyBatisConsumerBuilder useIterator(String useIterator) {
            this.properties.put("useIterator", useIterator);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public MyBatisConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public MyBatisConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public MyBatisConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public MyBatisConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public MyBatisConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public MyBatisConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To use a custom MyBatisProcessingStrategy. The option is a
         * org.apache.camel.component.mybatis.MyBatisProcessingStrategy type.
         */
        public MyBatisConsumerBuilder processingStrategy(
                Object processingStrategy) {
            this.properties.put("processingStrategy", processingStrategy);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To use a custom MyBatisProcessingStrategy. The option will be
         * converted to a
         * org.apache.camel.component.mybatis.MyBatisProcessingStrategy type.
         */
        public MyBatisConsumerBuilder processingStrategy(
                String processingStrategy) {
            this.properties.put("processingStrategy", processingStrategy);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public MyBatisConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a int type.
         */
        public MyBatisConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public MyBatisConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * int type.
         */
        public MyBatisConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public MyBatisConsumerBuilder backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a int type.
         */
        public MyBatisConsumerBuilder backoffMultiplier(String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public MyBatisConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a long
         * type.
         */
        public MyBatisConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public MyBatisConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a boolean type.
         */
        public MyBatisConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public MyBatisConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a long
         * type.
         */
        public MyBatisConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public MyBatisConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a org.apache.camel.LoggingLevel type.
         */
        public MyBatisConsumerBuilder runLoggingLevel(String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public MyBatisConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * java.util.concurrent.ScheduledExecutorService type.
         */
        public MyBatisConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public MyBatisConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public MyBatisConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public MyBatisConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public MyBatisConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public MyBatisConsumerBuilder startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a boolean type.
         */
        public MyBatisConsumerBuilder startScheduler(String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public MyBatisConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a java.util.concurrent.TimeUnit type.
         */
        public MyBatisConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public MyBatisConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (MyBatisConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a boolean type.
         */
        public MyBatisConsumerBuilder useFixedDelay(String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (MyBatisConsumerBuilder) this;
        }
    }

    public static class MyBatisProducerBuilder
            extends
                MyBatisCommonBuilder<MyBatisProducerBuilder>
            implements
                EndpointProducerBuilder {
        public MyBatisProducerBuilder(String path) {
            super(path);
        }
        /**
         * The executor type to be used while executing statements. simple -
         * executor does nothing special. reuse - executor reuses prepared
         * statements. batch - executor reuses statements and batches updates.
         * The option is a org.apache.ibatis.session.ExecutorType type.
         */
        public MyBatisProducerBuilder executorType(ExecutorType executorType) {
            this.properties.put("executorType", executorType);
            return (MyBatisProducerBuilder) this;
        }
        /**
         * The executor type to be used while executing statements. simple -
         * executor does nothing special. reuse - executor reuses prepared
         * statements. batch - executor reuses statements and batches updates.
         * The option will be converted to a
         * org.apache.ibatis.session.ExecutorType type.
         */
        public MyBatisProducerBuilder executorType(String executorType) {
            this.properties.put("executorType", executorType);
            return (MyBatisProducerBuilder) this;
        }
        /**
         * User the header value for input parameters instead of the message
         * body. By default, inputHeader == null and the input parameters are
         * taken from the message body. If outputHeader is set, the value is
         * used and query parameters will be taken from the header instead of
         * the body. The option is a java.lang.String type.
         */
        public MyBatisProducerBuilder inputHeader(String inputHeader) {
            this.properties.put("inputHeader", inputHeader);
            return (MyBatisProducerBuilder) this;
        }
        /**
         * Store the query result in a header instead of the message body. By
         * default, outputHeader == null and the query result is stored in the
         * message body, any existing content in the message body is discarded.
         * If outputHeader is set, the value is used as the name of the header
         * to store the query result and the original message body is preserved.
         * Setting outputHeader will also omit populating the default
         * CamelMyBatisResult header since it would be the same as outputHeader
         * all the time. The option is a java.lang.String type.
         */
        public MyBatisProducerBuilder outputHeader(String outputHeader) {
            this.properties.put("outputHeader", outputHeader);
            return (MyBatisProducerBuilder) this;
        }
        /**
         * Mandatory to specify for the producer to control which kind of
         * operation to invoke. The option is a
         * org.apache.camel.component.mybatis.StatementType type.
         */
        public MyBatisProducerBuilder statementType(StatementType statementType) {
            this.properties.put("statementType", statementType);
            return (MyBatisProducerBuilder) this;
        }
        /**
         * Mandatory to specify for the producer to control which kind of
         * operation to invoke. The option will be converted to a
         * org.apache.camel.component.mybatis.StatementType type.
         */
        public MyBatisProducerBuilder statementType(String statementType) {
            this.properties.put("statementType", statementType);
            return (MyBatisProducerBuilder) this;
        }
    }

    public static enum ExecutorType {
        SIMPLE, REUSE, BATCH;
    }

    public static enum StatementType {
        SelectOne, SelectList, Insert, InsertList, Update, UpdateList, Delete, DeleteList;
    }
    public default MyBatisConsumerBuilder fromMyBatis(String path) {
        return new MyBatisConsumerBuilder(path);
    }
    public default MyBatisProducerBuilder toMyBatis(String path) {
        return new MyBatisProducerBuilder(path);
    }
}