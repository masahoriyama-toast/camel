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
 * Validates the payload of a message using the MSV Library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MsvEndpointBuilder {


    public static class MsvCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        MsvCommonBuilder(String path) {
            super("msv", path);
        }
        /**
         * URL to a local resource on the classpath,or a reference to lookup a
         * bean in the Registry, or a full URL to a remote resource or resource
         * on the file system which contains the XSD to validate against. The
         * option is a java.lang.String type.
         */
        public T resourceUri(String resourceUri) {
            this.properties.put("resourceUri", resourceUri);
            return (T) this;
        }
        /**
         * Whether to fail if no body exists. The option is a boolean type.
         */
        public T failOnNullBody(boolean failOnNullBody) {
            this.properties.put("failOnNullBody", failOnNullBody);
            return (T) this;
        }
        /**
         * Whether to fail if no body exists. The option will be converted to a
         * boolean type.
         */
        public T failOnNullBody(String failOnNullBody) {
            this.properties.put("failOnNullBody", failOnNullBody);
            return (T) this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * The option is a boolean type.
         */
        public T failOnNullHeader(boolean failOnNullHeader) {
            this.properties.put("failOnNullHeader", failOnNullHeader);
            return (T) this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * The option will be converted to a boolean type.
         */
        public T failOnNullHeader(String failOnNullHeader) {
            this.properties.put("failOnNullHeader", failOnNullHeader);
            return (T) this;
        }
        /**
         * To validate against a header instead of the message body. The option
         * is a java.lang.String type.
         */
        public T headerName(String headerName) {
            this.properties.put("headerName", headerName);
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
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * The option is a
         * org.apache.camel.support.processor.validation.ValidatorErrorHandler
         * type.
         */
        public T errorHandler(Object errorHandler) {
            this.properties.put("errorHandler", errorHandler);
            return (T) this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * The option will be converted to a
         * org.apache.camel.support.processor.validation.ValidatorErrorHandler
         * type.
         */
        public T errorHandler(String errorHandler) {
            this.properties.put("errorHandler", errorHandler);
            return (T) this;
        }
        /**
         * To use a custom LSResourceResolver. See also
         * setResourceResolverFactory(ValidatorResourceResolverFactory). The
         * option is a org.w3c.dom.ls.LSResourceResolver type.
         */
        public T resourceResolver(Object resourceResolver) {
            this.properties.put("resourceResolver", resourceResolver);
            return (T) this;
        }
        /**
         * To use a custom LSResourceResolver. See also
         * setResourceResolverFactory(ValidatorResourceResolverFactory). The
         * option will be converted to a org.w3c.dom.ls.LSResourceResolver type.
         */
        public T resourceResolver(String resourceResolver) {
            this.properties.put("resourceResolver", resourceResolver);
            return (T) this;
        }
        /**
         * For creating a resource resolver which depends on the endpoint
         * resource URI. Must not be used in combination with method
         * setResourceResolver(LSResourceResolver). If not set then
         * DefaultValidatorResourceResolverFactory is used. The option is a
         * org.apache.camel.component.validator.ValidatorResourceResolverFactory
         * type.
         */
        public T resourceResolverFactory(Object resourceResolverFactory) {
            this.properties.put("resourceResolverFactory", resourceResolverFactory);
            return (T) this;
        }
        /**
         * For creating a resource resolver which depends on the endpoint
         * resource URI. Must not be used in combination with method
         * setResourceResolver(LSResourceResolver). If not set then
         * DefaultValidatorResourceResolverFactory is used. The option will be
         * converted to a
         * org.apache.camel.component.validator.ValidatorResourceResolverFactory
         * type.
         */
        public T resourceResolverFactory(String resourceResolverFactory) {
            this.properties.put("resourceResolverFactory", resourceResolverFactory);
            return (T) this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory. The option is a
         * javax.xml.validation.SchemaFactory type.
         */
        public T schemaFactory(Object schemaFactory) {
            this.properties.put("schemaFactory", schemaFactory);
            return (T) this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory. The option will
         * be converted to a javax.xml.validation.SchemaFactory type.
         */
        public T schemaFactory(String schemaFactory) {
            this.properties.put("schemaFactory", schemaFactory);
            return (T) this;
        }
        /**
         * Configures the W3C XML Schema Namespace URI. The option is a
         * java.lang.String type.
         */
        public T schemaLanguage(String schemaLanguage) {
            this.properties.put("schemaLanguage", schemaLanguage);
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
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue. The option is a boolean type.
         */
        public T useSharedSchema(boolean useSharedSchema) {
            this.properties.put("useSharedSchema", useSharedSchema);
            return (T) this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue. The option will be converted to a boolean type.
         */
        public T useSharedSchema(String useSharedSchema) {
            this.properties.put("useSharedSchema", useSharedSchema);
            return (T) this;
        }
    }

    public static class MsvProducerBuilder
            extends
                MsvCommonBuilder<MsvProducerBuilder>
            implements
                EndpointProducerBuilder {
        public MsvProducerBuilder(String path) {
            super(path);
        }
    }
    public default MsvProducerBuilder toMsv(String path) {
        return new MsvProducerBuilder(path);
    }
}