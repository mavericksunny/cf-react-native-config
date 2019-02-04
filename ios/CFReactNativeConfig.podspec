
Pod::Spec.new do |s|
  s.name         = "CFReactNativeConfig"
  s.version      = "1.0.0"
  s.summary      = "CFReactNativeConfig"
  s.description  = <<-DESC
                  CFReactNativeConfig
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/CFReactNativeConfig.git", :tag => "master" }
  s.source_files  = "CFReactNativeConfig/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  