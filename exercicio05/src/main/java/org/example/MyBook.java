package org.example;

public class MyBook implements SocialPlatform {

    @Override
    public void sharePost(Post post) {
        System.out.println("You shared '" + post.getTitle() + "' on " + this.getClass().getSimpleName() + ".");
    }

    @Override
    public void shareImage(Post post) {
        System.out.println("You shared '" + post.getTitle() + "' on " + this.getClass().getSimpleName() + ".");
    }

    @Override
    public void shareVideo(Post post) {
        System.out.println("You shared '" + post.getTitle() + "' on " + this.getClass().getSimpleName() + ".");
    }
}
