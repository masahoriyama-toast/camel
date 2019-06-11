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
 * For reading/writing from/to an HDFS filesystem using Hadoop 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HdfsEndpointBuilder {


    public static class HdfsCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        HdfsCommonBuilder(String path) {
            super("hdfs", path);
        }
        /**
         * HDFS host to use. The option is a java.lang.String type.
         */
        public T hostName(String hostName) {
            this.properties.put("hostName", hostName);
            return (T) this;
        }
        /**
         * HDFS port to use. The option is a int type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * HDFS port to use. The option will be converted to a int type.
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * The directory path to use. The option is a java.lang.String type.
         */
        public T path(String path) {
            this.properties.put("path", path);
            return (T) this;
        }
        /**
         * Whether to connect to the HDFS file system on starting the
         * producer/consumer. If false then the connection is created on-demand.
         * Notice that HDFS may take up till 15 minutes to establish a
         * connection, as it has hardcoded 45 x 20 sec redelivery. By setting
         * this option to false allows your application to startup, and not
         * block for up till 15 minutes. The option is a boolean type.
         */
        public T connectOnStartup(boolean connectOnStartup) {
            this.properties.put("connectOnStartup", connectOnStartup);
            return (T) this;
        }
        /**
         * Whether to connect to the HDFS file system on starting the
         * producer/consumer. If false then the connection is created on-demand.
         * Notice that HDFS may take up till 15 minutes to establish a
         * connection, as it has hardcoded 45 x 20 sec redelivery. By setting
         * this option to false allows your application to startup, and not
         * block for up till 15 minutes. The option will be converted to a
         * boolean type.
         */
        public T connectOnStartup(String connectOnStartup) {
            this.properties.put("connectOnStartup", connectOnStartup);
            return (T) this;
        }
        /**
         * Set to LOCAL to not use HDFS but local java.io.File instead. The
         * option is a org.apache.camel.component.hdfs2.HdfsFileSystemType type.
         */
        public T fileSystemType(HdfsFileSystemType fileSystemType) {
            this.properties.put("fileSystemType", fileSystemType);
            return (T) this;
        }
        /**
         * Set to LOCAL to not use HDFS but local java.io.File instead. The
         * option will be converted to a
         * org.apache.camel.component.hdfs2.HdfsFileSystemType type.
         */
        public T fileSystemType(String fileSystemType) {
            this.properties.put("fileSystemType", fileSystemType);
            return (T) this;
        }
        /**
         * The file type to use. For more details see Hadoop HDFS documentation
         * about the various files types. The option is a
         * org.apache.camel.component.hdfs2.HdfsFileType type.
         */
        public T fileType(HdfsFileType fileType) {
            this.properties.put("fileType", fileType);
            return (T) this;
        }
        /**
         * The file type to use. For more details see Hadoop HDFS documentation
         * about the various files types. The option will be converted to a
         * org.apache.camel.component.hdfs2.HdfsFileType type.
         */
        public T fileType(String fileType) {
            this.properties.put("fileType", fileType);
            return (T) this;
        }
        /**
         * The type for the key in case of sequence or map files. The option is
         * a org.apache.camel.component.hdfs2.WritableType type.
         */
        public T keyType(WritableType keyType) {
            this.properties.put("keyType", keyType);
            return (T) this;
        }
        /**
         * The type for the key in case of sequence or map files. The option
         * will be converted to a org.apache.camel.component.hdfs2.WritableType
         * type.
         */
        public T keyType(String keyType) {
            this.properties.put("keyType", keyType);
            return (T) this;
        }
        /**
         * The file owner must match this owner for the consumer to pickup the
         * file. Otherwise the file is skipped. The option is a java.lang.String
         * type.
         */
        public T owner(String owner) {
            this.properties.put("owner", owner);
            return (T) this;
        }
        /**
         * The type for the key in case of sequence or map files. The option is
         * a org.apache.camel.component.hdfs2.WritableType type.
         */
        public T valueType(WritableType valueType) {
            this.properties.put("valueType", valueType);
            return (T) this;
        }
        /**
         * The type for the key in case of sequence or map files. The option
         * will be converted to a org.apache.camel.component.hdfs2.WritableType
         * type.
         */
        public T valueType(String valueType) {
            this.properties.put("valueType", valueType);
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
         * The size of the HDFS blocks. The option is a long type.
         */
        public T blockSize(long blockSize) {
            this.properties.put("blockSize", blockSize);
            return (T) this;
        }
        /**
         * The size of the HDFS blocks. The option will be converted to a long
         * type.
         */
        public T blockSize(String blockSize) {
            this.properties.put("blockSize", blockSize);
            return (T) this;
        }
        /**
         * The buffer size used by HDFS. The option is a int type.
         */
        public T bufferSize(int bufferSize) {
            this.properties.put("bufferSize", bufferSize);
            return (T) this;
        }
        /**
         * The buffer size used by HDFS. The option will be converted to a int
         * type.
         */
        public T bufferSize(String bufferSize) {
            this.properties.put("bufferSize", bufferSize);
            return (T) this;
        }
        /**
         * How often (time in millis) in to run the idle checker background
         * task. This option is only in use if the splitter strategy is IDLE.
         * The option is a int type.
         */
        public T checkIdleInterval(int checkIdleInterval) {
            this.properties.put("checkIdleInterval", checkIdleInterval);
            return (T) this;
        }
        /**
         * How often (time in millis) in to run the idle checker background
         * task. This option is only in use if the splitter strategy is IDLE.
         * The option will be converted to a int type.
         */
        public T checkIdleInterval(String checkIdleInterval) {
            this.properties.put("checkIdleInterval", checkIdleInterval);
            return (T) this;
        }
        /**
         * When reading a normal file, this is split into chunks producing a
         * message per chunk. The option is a int type.
         */
        public T chunkSize(int chunkSize) {
            this.properties.put("chunkSize", chunkSize);
            return (T) this;
        }
        /**
         * When reading a normal file, this is split into chunks producing a
         * message per chunk. The option will be converted to a int type.
         */
        public T chunkSize(String chunkSize) {
            this.properties.put("chunkSize", chunkSize);
            return (T) this;
        }
        /**
         * The compression codec to use. The option is a
         * org.apache.camel.component.hdfs2.HdfsCompressionCodec type.
         */
        public T compressionCodec(HdfsCompressionCodec compressionCodec) {
            this.properties.put("compressionCodec", compressionCodec);
            return (T) this;
        }
        /**
         * The compression codec to use. The option will be converted to a
         * org.apache.camel.component.hdfs2.HdfsCompressionCodec type.
         */
        public T compressionCodec(String compressionCodec) {
            this.properties.put("compressionCodec", compressionCodec);
            return (T) this;
        }
        /**
         * The compression type to use (is default not in use). The option is a
         * org.apache.hadoop.io.SequenceFile.CompressionType type.
         */
        public T compressionType(Object compressionType) {
            this.properties.put("compressionType", compressionType);
            return (T) this;
        }
        /**
         * The compression type to use (is default not in use). The option will
         * be converted to a org.apache.hadoop.io.SequenceFile.CompressionType
         * type.
         */
        public T compressionType(String compressionType) {
            this.properties.put("compressionType", compressionType);
            return (T) this;
        }
        /**
         * When a file is opened for reading/writing the file is renamed with
         * this suffix to avoid to read it during the writing phase. The option
         * is a java.lang.String type.
         */
        public T openedSuffix(String openedSuffix) {
            this.properties.put("openedSuffix", openedSuffix);
            return (T) this;
        }
        /**
         * Once the file has been read is renamed with this suffix to avoid to
         * read it again. The option is a java.lang.String type.
         */
        public T readSuffix(String readSuffix) {
            this.properties.put("readSuffix", readSuffix);
            return (T) this;
        }
        /**
         * The HDFS replication factor. The option is a short type.
         */
        public T replication(short replication) {
            this.properties.put("replication", replication);
            return (T) this;
        }
        /**
         * The HDFS replication factor. The option will be converted to a short
         * type.
         */
        public T replication(String replication) {
            this.properties.put("replication", replication);
            return (T) this;
        }
        /**
         * In the current version of Hadoop opening a file in append mode is
         * disabled since it's not very reliable. So, for the moment, it's only
         * possible to create new files. The Camel HDFS endpoint tries to solve
         * this problem in this way: If the split strategy option has been
         * defined, the hdfs path will be used as a directory and files will be
         * created using the configured UuidGenerator. Every time a splitting
         * condition is met, a new file is created. The splitStrategy option is
         * defined as a string with the following syntax:
         * splitStrategy=ST:value,ST:value,... where ST can be: BYTES a new file
         * is created, and the old is closed when the number of written bytes is
         * more than value MESSAGES a new file is created, and the old is closed
         * when the number of written messages is more than value IDLE a new
         * file is created, and the old is closed when no writing happened in
         * the last value milliseconds. The option is a java.lang.String type.
         */
        public T splitStrategy(String splitStrategy) {
            this.properties.put("splitStrategy", splitStrategy);
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

    public static class HdfsConsumerBuilder
            extends
                HdfsCommonBuilder<HdfsConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public HdfsConsumerBuilder(String path) {
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
        public HdfsConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HdfsConsumerBuilder) this;
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
        public HdfsConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The pattern used for scanning the directory. The option is a
         * java.lang.String type.
         */
        public HdfsConsumerBuilder pattern(String pattern) {
            this.properties.put("pattern", pattern);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public HdfsConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a boolean type.
         */
        public HdfsConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public HdfsConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public HdfsConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public HdfsConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public HdfsConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public HdfsConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public HdfsConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public HdfsConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a int type.
         */
        public HdfsConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public HdfsConsumerBuilder backoffIdleThreshold(int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * int type.
         */
        public HdfsConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public HdfsConsumerBuilder backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a int type.
         */
        public HdfsConsumerBuilder backoffMultiplier(String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public HdfsConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a long
         * type.
         */
        public HdfsConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public HdfsConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a boolean type.
         */
        public HdfsConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public HdfsConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a long
         * type.
         */
        public HdfsConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public HdfsConsumerBuilder runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a org.apache.camel.LoggingLevel type.
         */
        public HdfsConsumerBuilder runLoggingLevel(String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public HdfsConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * java.util.concurrent.ScheduledExecutorService type.
         */
        public HdfsConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public HdfsConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public HdfsConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public HdfsConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public HdfsConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public HdfsConsumerBuilder startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a boolean type.
         */
        public HdfsConsumerBuilder startScheduler(String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public HdfsConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a java.util.concurrent.TimeUnit type.
         */
        public HdfsConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public HdfsConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (HdfsConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a boolean type.
         */
        public HdfsConsumerBuilder useFixedDelay(String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (HdfsConsumerBuilder) this;
        }
    }

    public static class HdfsProducerBuilder
            extends
                HdfsCommonBuilder<HdfsProducerBuilder>
            implements
                EndpointProducerBuilder {
        public HdfsProducerBuilder(String path) {
            super(path);
        }
        /**
         * Append to existing file. Notice that not all HDFS file systems
         * support the append option. The option is a boolean type.
         */
        public HdfsProducerBuilder append(boolean append) {
            this.properties.put("append", append);
            return (HdfsProducerBuilder) this;
        }
        /**
         * Append to existing file. Notice that not all HDFS file systems
         * support the append option. The option will be converted to a boolean
         * type.
         */
        public HdfsProducerBuilder append(String append) {
            this.properties.put("append", append);
            return (HdfsProducerBuilder) this;
        }
        /**
         * Whether to overwrite existing files with the same name. The option is
         * a boolean type.
         */
        public HdfsProducerBuilder overwrite(boolean overwrite) {
            this.properties.put("overwrite", overwrite);
            return (HdfsProducerBuilder) this;
        }
        /**
         * Whether to overwrite existing files with the same name. The option
         * will be converted to a boolean type.
         */
        public HdfsProducerBuilder overwrite(String overwrite) {
            this.properties.put("overwrite", overwrite);
            return (HdfsProducerBuilder) this;
        }
    }

    public static enum HdfsFileSystemType {
        LOCAL, HDFS;
    }

    public static enum HdfsFileType {
        NORMAL_FILE, SEQUENCE_FILE, MAP_FILE, BLOOMMAP_FILE, ARRAY_FILE;
    }

    public static enum WritableType {
        NULL, BOOLEAN, BYTE, INT, FLOAT, LONG, DOUBLE, TEXT, BYTES;
    }

    public static enum HdfsCompressionCodec {
        DEFAULT, GZIP, BZIP2;
    }
    public default HdfsConsumerBuilder fromHdfs(String path) {
        return new HdfsConsumerBuilder(path);
    }
    public default HdfsProducerBuilder toHdfs(String path) {
        return new HdfsProducerBuilder(path);
    }
}