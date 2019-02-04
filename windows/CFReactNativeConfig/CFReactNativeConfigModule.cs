using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Config.CFReactNativeConfig
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class CFReactNativeConfigModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="CFReactNativeConfigModule"/>.
        /// </summary>
        internal CFReactNativeConfigModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "CFReactNativeConfig";
            }
        }
    }
}
