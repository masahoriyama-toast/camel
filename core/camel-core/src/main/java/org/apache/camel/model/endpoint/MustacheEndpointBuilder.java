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
 * Transforms the message using a Mustache template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MustacheEndpointBuilder {


    public static class MustacheCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        MustacheCommonBuilder(String path) {
            super("mustache", path);
        }
        /**
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod. The option is a java.lang.String type.
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Sets whether to use resource content cache or not. The option is a
         * boolean type.
         */
        public T contentCache(boolean contentCache) {
            this.properties.put("contentCache", contentCache);
            return (T) this;
        }
        /**
         * Sets whether to use resource content cache or not. The option will be
         * converted to a boolean type.
         */
        public T contentCache(String contentCache) {
            this.properties.put("contentCache", contentCache);
            return (T) this;
        }
        /**
         * Character encoding of the resource content. The option is a
         * java.lang.String type.
         */
        public T encoding(String encoding) {
            this.properties.put("encoding", encoding);
            return (T) this;
        }
        /**
         * Characters used to mark template code end. The option is a
         * java.lang.String type.
         */
        public T endDelimiter(String endDelimiter) {
            this.properties.put("endDelimiter", endDelimiter);
            return (T) this;
        }
        /**
         * Characters used to mark template code beginning. The option is a
         * java.lang.String type.
         */
        public T startDelimiter(String startDelimiter) {
            this.properties.put("startDelimiter", startDelimiter);
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

    public static class MustacheProducerBuilder
            extends
                MustacheCommonBuilder<MustacheProducerBuilder>
            implements
                EndpointProducerBuilder {
        public MustacheProducerBuilder(String path) {
            super(path);
        }
    }
    public default MustacheProducerBuilder toMustache(String path) {
        return new MustacheProducerBuilder(path);
    }
}