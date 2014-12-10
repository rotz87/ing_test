package resourcemodel;

import model.Bookmark;
import controller.BookmarkController;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.VndErrors;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

public class BookmarkResource extends ResourceSupport{
	
	private final Bookmark bookmark;

	public BookmarkResource(Bookmark bookmark) {
		String username = bookmark.getAccount().getUsername();
		this.bookmark = bookmark;
		this.add(new Link(bookmark.getUri(), "bookmark-uri"));
		this.add(ControllerLinkBuilder.linkTo(BookmarkController.class, username).withRel("bookmarks"));
		this.add(ControllerLinkBuilder.linkTo(
				ControllerLinkBuilder.methodOn(BookmarkController.class, username).readBookmark(null,
						bookmark.getId())).withSelfRel());
	}

	public Bookmark getBookmark() {
		return bookmark;
	}
}
