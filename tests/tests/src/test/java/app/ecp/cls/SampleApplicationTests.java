/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.ecp.cls;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import app.ecp.cls.Foo;

/**
 * @author Andy Clement
 *
 */
@SpringBootTest(properties = "spring.functional.enabled=false")
@RunWith(SpringRunner.class)
public class SampleApplicationTests {

	@Autowired
	private Foo foo;

	@Test
	public void test() {
		assertThat(foo).isNotNull();
		assertThat(foo.getValue()).isEqualTo("dave");
	}

}
