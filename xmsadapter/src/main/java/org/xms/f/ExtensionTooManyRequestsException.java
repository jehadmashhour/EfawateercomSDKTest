package org.xms.f;




public class ExtensionTooManyRequestsException extends org.xms.f.ExtensionException {
    private boolean wrapper = true;
    
    
    
    public ExtensionTooManyRequestsException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public ExtensionTooManyRequestsException(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(null);
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public static org.xms.f.ExtensionTooManyRequestsException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.ExtensionTooManyRequestsException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.FirebaseTooManyRequestsException;
        }
    }
    
    private class GImpl extends com.google.firebase.FirebaseTooManyRequestsException {
        
        public GImpl(java.lang.String param0) {
            super(param0);
        }
    }
}