package com.library;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.slayer.service.LMSBookLocalServiceUtil;

/**
 * Portlet implementation class LibraryPortlet
 */
public class LibraryPortlet extends MVCPortlet {

	// public void updateBook(ActionRequest actionRequest, ActionResponse
	// actionResponse) throws IOException,PortletException
	// {System.out.println("helllllllllllllllllllllllllll");
	// String bookTitle = ParamUtil.getString(actionRequest, "bookTitle");
	// String author = ParamUtil.getString(actionRequest, "author");
	// System.out.println("Book Title is: "+bookTitle+" and the author is: "+author);
	// }

	public void updateBook(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		// System.out.println("helllllllllllllllllllllllllll");

		String bookTitle = ParamUtil.getString(actionRequest, "bookTitle");
		String author = ParamUtil.getString(actionRequest, "author");
		System.out.println("Book Title is: " + bookTitle
				+ " and the author is: " + author);
		LMSBookLocalServiceUtil.insertBook(bookTitle, author);
		// redirect url after insert
		// String redirectURL = ParamUtil.getString(actionRequest,
		// "redirectURL");
		// actionResponse.sendRedirect(redirectURL);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		PortletConfig portletConfig = (PortletConfig) actionRequest
				.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();
		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		successPageURL.setParameter("jspPage", LibraryConstants.PAGE_SUCCESS);
		System.out.println(successPageURL.toString());
		actionResponse.sendRedirect(successPageURL.toString());
	}

	public void deleteBook(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException,PortletException
	{
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		if(bookId>1)
		{
			try {
				LMSBookLocalServiceUtil.deleteLMSBook(bookId);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		actionResponse.sendRedirect(redirectURL);
	}

}
