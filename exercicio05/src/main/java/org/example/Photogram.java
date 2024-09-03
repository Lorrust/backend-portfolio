package org.example;

public class Photogram implements SocialPlatform {

    @Override
    public void sharePost(Post post) {
        throw new IllegalArgumentException("Media type not supported on " + this.getClass().getSimpleName() + ".");
    }

    @Override
    public void shareImage(Post post) {
        if (post.getType().equals(TypeEnum.IMAGE)) {
            System.out.println("You shared '" + post.getTitle() + "' on " + this.getClass().getSimpleName() + ".");
        }
        else {
            throw new IllegalArgumentException("Media type not supported on " + this.getClass().getSimpleName() + ".");
        }
    }

    @Override
    public void shareVideo(Post post) {
        if (post.getType().equals(TypeEnum.VIDEO)) {
        System.out.println("You shared '" + post.getTitle() + "' on " + this.getClass().getSimpleName() + ".");
        }
        else {
            throw new IllegalArgumentException("Media type not supported on " + this.getClass().getSimpleName() + ".");
        }
    }
}
