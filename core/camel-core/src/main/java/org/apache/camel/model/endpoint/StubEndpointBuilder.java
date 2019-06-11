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

import java.util.concurrent.BlockingQueue;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.WaitForTaskToComplete;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The stub component provides a simple way to stub out any physical endpoints
 * while in development or testing.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StubEndpointBuilder {


    public static class StubCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        StubCommonBuilder(String path) {
            super("stub", path);
        }
        /**
         * Name of queue. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component. The option is a int type.
         */
        public T size(int size) {
            this.properties.put("size", size);
            return (T) this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component. The option will be converted to a int type.
         */
        public T size(String size) {
            this.properties.put("size", size);
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
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance. The option is a java.util.concurrent.BlockingQueue
         * type.
         */
        public T queue(BlockingQueue queue) {
            this.properties.put("queue", queue);
            return (T) this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance. The option will be converted to a
         * java.util.concurrent.BlockingQueue type.
         */
        public T queue(String queue) {
            this.properties.put("queue", queue);
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

    public static class StubConsumerBuilder
            extends
                StubCommonBuilder<StubConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public StubConsumerBuilder(String path) {
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
        public StubConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (StubConsumerBuilder) this;
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
        public StubConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (StubConsumerBuilder) this;
        }
        /**
         * Number of concurrent threads processing exchanges. The option is a
         * int type.
         */
        public StubConsumerBuilder concurrentConsumers(int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (StubConsumerBuilder) this;
        }
        /**
         * Number of concurrent threads processing exchanges. The option will be
         * converted to a int type.
         */
        public StubConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (StubConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public StubConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (StubConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public StubConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (StubConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public StubConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (StubConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public StubConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (StubConsumerBuilder) this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off. The option is a boolean type.
         */
        public StubConsumerBuilder limitConcurrentConsumers(
                boolean limitConcurrentConsumers) {
            this.properties.put("limitConcurrentConsumers", limitConcurrentConsumers);
            return (StubConsumerBuilder) this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off. The option will be converted to a boolean
         * type.
         */
        public StubConsumerBuilder limitConcurrentConsumers(
                String limitConcurrentConsumers) {
            this.properties.put("limitConcurrentConsumers", limitConcurrentConsumers);
            return (StubConsumerBuilder) this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint. The option is a boolean type.
         */
        public StubConsumerBuilder multipleConsumers(boolean multipleConsumers) {
            this.properties.put("multipleConsumers", multipleConsumers);
            return (StubConsumerBuilder) this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint. The option will be converted to a boolean type.
         */
        public StubConsumerBuilder multipleConsumers(String multipleConsumers) {
            this.properties.put("multipleConsumers", multipleConsumers);
            return (StubConsumerBuilder) this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown. The
         * option is a int type.
         */
        public StubConsumerBuilder pollTimeout(int pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (StubConsumerBuilder) this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown. The
         * option will be converted to a int type.
         */
        public StubConsumerBuilder pollTimeout(String pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (StubConsumerBuilder) this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded. The option is a boolean type.
         */
        public StubConsumerBuilder purgeWhenStopping(boolean purgeWhenStopping) {
            this.properties.put("purgeWhenStopping", purgeWhenStopping);
            return (StubConsumerBuilder) this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded. The option will be converted to a boolean type.
         */
        public StubConsumerBuilder purgeWhenStopping(String purgeWhenStopping) {
            this.properties.put("purgeWhenStopping", purgeWhenStopping);
            return (StubConsumerBuilder) this;
        }
    }

    public static class StubProducerBuilder
            extends
                StubCommonBuilder<StubProducerBuilder>
            implements
                EndpointProducerBuilder {
        public StubProducerBuilder(String path) {
            super(path);
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted. The option is a boolean type.
         */
        public StubProducerBuilder blockWhenFull(boolean blockWhenFull) {
            this.properties.put("blockWhenFull", blockWhenFull);
            return (StubProducerBuilder) this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted. The option will be converted to a boolean
         * type.
         */
        public StubProducerBuilder blockWhenFull(String blockWhenFull) {
            this.properties.put("blockWhenFull", blockWhenFull);
            return (StubProducerBuilder) this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time. The option is a
         * boolean type.
         */
        public StubProducerBuilder discardIfNoConsumers(
                boolean discardIfNoConsumers) {
            this.properties.put("discardIfNoConsumers", discardIfNoConsumers);
            return (StubProducerBuilder) this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time. The option will be
         * converted to a boolean type.
         */
        public StubProducerBuilder discardIfNoConsumers(
                String discardIfNoConsumers) {
            this.properties.put("discardIfNoConsumers", discardIfNoConsumers);
            return (StubProducerBuilder) this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time. The option is a boolean type.
         */
        public StubProducerBuilder failIfNoConsumers(boolean failIfNoConsumers) {
            this.properties.put("failIfNoConsumers", failIfNoConsumers);
            return (StubProducerBuilder) this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time. The option will be converted to a boolean type.
         */
        public StubProducerBuilder failIfNoConsumers(String failIfNoConsumers) {
            this.properties.put("failIfNoConsumers", failIfNoConsumers);
            return (StubProducerBuilder) this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value. The option is a long type.
         */
        public StubProducerBuilder offerTimeout(long offerTimeout) {
            this.properties.put("offerTimeout", offerTimeout);
            return (StubProducerBuilder) this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value. The option will be converted to a long type.
         */
        public StubProducerBuilder offerTimeout(String offerTimeout) {
            this.properties.put("offerTimeout", offerTimeout);
            return (StubProducerBuilder) this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value. The option is a long type.
         */
        public StubProducerBuilder timeout(long timeout) {
            this.properties.put("timeout", timeout);
            return (StubProducerBuilder) this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value. The option will be converted to a long
         * type.
         */
        public StubProducerBuilder timeout(String timeout) {
            this.properties.put("timeout", timeout);
            return (StubProducerBuilder) this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected. The option is a
         * org.apache.camel.WaitForTaskToComplete type.
         */
        public StubProducerBuilder waitForTaskToComplete(
                WaitForTaskToComplete waitForTaskToComplete) {
            this.properties.put("waitForTaskToComplete", waitForTaskToComplete);
            return (StubProducerBuilder) this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected. The option will be converted to a
         * org.apache.camel.WaitForTaskToComplete type.
         */
        public StubProducerBuilder waitForTaskToComplete(
                String waitForTaskToComplete) {
            this.properties.put("waitForTaskToComplete", waitForTaskToComplete);
            return (StubProducerBuilder) this;
        }
    }
    public default StubConsumerBuilder fromStub(String path) {
        return new StubConsumerBuilder(path);
    }
    public default StubProducerBuilder toStub(String path) {
        return new StubProducerBuilder(path);
    }
}