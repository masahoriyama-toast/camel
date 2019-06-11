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
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The Ignite Queue endpoint is one of camel-ignite endpoints which allows you
 * to interact with Ignite Queue data structures.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteQueueEndpointBuilder {


    public static class IgniteQueueCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        IgniteQueueCommonBuilder(String path) {
            super("ignite-queue", path);
        }
        /**
         * The queue name. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void. The option is a boolean type.
         */
        public T propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            this.properties.put("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return (T) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void. The option will be converted to
         * a boolean type.
         */
        public T propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            this.properties.put("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return (T) this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc. The option is a boolean type.
         */
        public T treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            this.properties.put("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return (T) this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc. The option will be converted
         * to a boolean type.
         */
        public T treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            this.properties.put("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
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

    public static class IgniteQueueProducerBuilder
            extends
                IgniteQueueCommonBuilder<IgniteQueueProducerBuilder>
            implements
                EndpointProducerBuilder {
        public IgniteQueueProducerBuilder(String path) {
            super(path);
        }
        /**
         * The queue capacity. Default: non-bounded. The option is a int type.
         */
        public IgniteQueueProducerBuilder capacity(int capacity) {
            this.properties.put("capacity", capacity);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The queue capacity. Default: non-bounded. The option will be
         * converted to a int type.
         */
        public IgniteQueueProducerBuilder capacity(String capacity) {
            this.properties.put("capacity", capacity);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The collection configuration. Default: empty configuration. You can
         * also conveniently set inner properties by using configuration.xyz=123
         * options. The option is a
         * org.apache.ignite.configuration.CollectionConfiguration type.
         */
        public IgniteQueueProducerBuilder configuration(Object configuration) {
            this.properties.put("configuration", configuration);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The collection configuration. Default: empty configuration. You can
         * also conveniently set inner properties by using configuration.xyz=123
         * options. The option will be converted to a
         * org.apache.ignite.configuration.CollectionConfiguration type.
         */
        public IgniteQueueProducerBuilder configuration(String configuration) {
            this.properties.put("configuration", configuration);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The operation to invoke on the Ignite Queue. Superseded by the
         * IgniteConstants.IGNITE_QUEUE_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT. The
         * option is a
         * org.apache.camel.component.ignite.queue.IgniteQueueOperation type.
         */
        public IgniteQueueProducerBuilder operation(
                IgniteQueueOperation operation) {
            this.properties.put("operation", operation);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The operation to invoke on the Ignite Queue. Superseded by the
         * IgniteConstants.IGNITE_QUEUE_OPERATION header in the IN message.
         * Possible values: CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR,
         * RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT. The
         * option will be converted to a
         * org.apache.camel.component.ignite.queue.IgniteQueueOperation type.
         */
        public IgniteQueueProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The queue timeout in milliseconds. Default: no timeout. The option is
         * a java.lang.Long type.
         */
        public IgniteQueueProducerBuilder timeoutMillis(Long timeoutMillis) {
            this.properties.put("timeoutMillis", timeoutMillis);
            return (IgniteQueueProducerBuilder) this;
        }
        /**
         * The queue timeout in milliseconds. Default: no timeout. The option
         * will be converted to a java.lang.Long type.
         */
        public IgniteQueueProducerBuilder timeoutMillis(String timeoutMillis) {
            this.properties.put("timeoutMillis", timeoutMillis);
            return (IgniteQueueProducerBuilder) this;
        }
    }

    public static enum IgniteQueueOperation {
        CONTAINS, ADD, SIZE, REMOVE, ITERATOR, CLEAR, RETAIN_ALL, ARRAY, DRAIN, ELEMENT, PEEK, OFFER, POLL, TAKE, PUT;
    }
    public default IgniteQueueProducerBuilder toIgniteQueue(String path) {
        return new IgniteQueueProducerBuilder(path);
    }
}