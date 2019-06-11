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

import javax.annotation.Generated;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.Language;

/**
 * The controlbus component provides easy management of Camel applications based
 * on the Control Bus EIP pattern.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ControlBusEndpointBuilder {


    public static class ControlBusCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        ControlBusCommonBuilder(String path) {
            super("controlbus", path);
        }
        /**
         * Command can be either route or language. The option is a
         * java.lang.String type.
         */
        public T command(String command) {
            this.properties.put("command", command);
            return (T) this;
        }
        /**
         * Allows you to specify the name of a Language to use for evaluating
         * the message body. If there is any result from the evaluation, then
         * the result is put in the message body. The option is a
         * org.apache.camel.spi.Language type.
         */
        public T language(Language language) {
            this.properties.put("language", language);
            return (T) this;
        }
        /**
         * Allows you to specify the name of a Language to use for evaluating
         * the message body. If there is any result from the evaluation, then
         * the result is put in the message body. The option will be converted
         * to a org.apache.camel.spi.Language type.
         */
        public T language(String language) {
            this.properties.put("language", language);
            return (T) this;
        }
        /**
         * To denote an action that can be either: start, stop, or status. To
         * either start or stop a route, or to get the status of the route as
         * output in the message body. You can use suspend and resume from Camel
         * 2.11.1 onwards to either suspend or resume a route. And from Camel
         * 2.11.1 onwards you can use stats to get performance statics returned
         * in XML format; the routeId option can be used to define which route
         * to get the performance stats for, if routeId is not defined, then you
         * get statistics for the entire CamelContext. The restart action will
         * restart the route. The option is a java.lang.String type.
         */
        public T action(String action) {
            this.properties.put("action", action);
            return (T) this;
        }
        /**
         * Whether to execute the control bus task asynchronously. Important: If
         * this option is enabled, then any result from the task is not set on
         * the Exchange. This is only possible if executing tasks synchronously.
         * The option is a boolean type.
         */
        public T async(boolean async) {
            this.properties.put("async", async);
            return (T) this;
        }
        /**
         * Whether to execute the control bus task asynchronously. Important: If
         * this option is enabled, then any result from the task is not set on
         * the Exchange. This is only possible if executing tasks synchronously.
         * The option will be converted to a boolean type.
         */
        public T async(String async) {
            this.properties.put("async", async);
            return (T) this;
        }
        /**
         * Logging level used for logging when task is done, or if any
         * exceptions occurred during processing the task. The option is a
         * org.apache.camel.LoggingLevel type.
         */
        public T loggingLevel(LoggingLevel loggingLevel) {
            this.properties.put("loggingLevel", loggingLevel);
            return (T) this;
        }
        /**
         * Logging level used for logging when task is done, or if any
         * exceptions occurred during processing the task. The option will be
         * converted to a org.apache.camel.LoggingLevel type.
         */
        public T loggingLevel(String loggingLevel) {
            this.properties.put("loggingLevel", loggingLevel);
            return (T) this;
        }
        /**
         * The delay in millis to use when restarting a route. The option is a
         * int type.
         */
        public T restartDelay(int restartDelay) {
            this.properties.put("restartDelay", restartDelay);
            return (T) this;
        }
        /**
         * The delay in millis to use when restarting a route. The option will
         * be converted to a int type.
         */
        public T restartDelay(String restartDelay) {
            this.properties.put("restartDelay", restartDelay);
            return (T) this;
        }
        /**
         * To specify a route by its id. The special keyword current indicates
         * the current route. The option is a java.lang.String type.
         */
        public T routeId(String routeId) {
            this.properties.put("routeId", routeId);
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

    public static class ControlBusProducerBuilder
            extends
                ControlBusCommonBuilder<ControlBusProducerBuilder>
            implements
                EndpointProducerBuilder {
        public ControlBusProducerBuilder(String path) {
            super(path);
        }
    }
    public default ControlBusProducerBuilder toControlBus(String path) {
        return new ControlBusProducerBuilder(path);
    }
}