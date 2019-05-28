package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.Index;

@Configuration
// @ComponentScan(basePackages = "com.cafe24.springcontainer.soundsystem")
// @ComponentScan(basePackages = {"com.cafe24.springcontainer.soundsystem", "com.cafe24.springcontainer.videosystem"})
// basePackageClasses에 지정한 클래스가 속한 패키지를 base Package 사용한다.(Market Inteface)
@ComponentScan(basePackageClasses = Index.class)
public class CDPlayerConfig {
	
}
