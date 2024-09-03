package org.example;

import java.io.PipedOutputStream;

public interface SocialPlatform {

    public void sharePost(Post post);
    public void shareImage(Post post);
    public void shareVideo(Post post);

}
