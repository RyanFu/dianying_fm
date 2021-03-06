package test.httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class GuavaCharTest {
	Double d;
	double dd;

	public void test() throws DecoderException, UnsupportedEncodingException {

		String str = StringUtils.trimToNull(CharMatcher
				.inRange('\u4e00', '\u9fa5').or(CharMatcher.WHITESPACE)
				.retainFrom("舞出我人生4 Step Up: Revolution Step Up: Revolution"));

		System.out.println(StringUtils.trim(str));

		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println(df.format(3242.1));

		String url = "http://www.dailiaaa.com/?ddh=263386390575109&dq=%C8%AB%B9%FA&sl=1&xl=2&cf=4&tj=%CC%E1+%C8%A1";

		System.out.println(URLDecoder.decode(url, "UTF-8"));

		System.out.println(d + "," + dd);

		System.out.println(Splitter.on('/').omitEmptyStrings()
				.split("/movie/seizure-the-story-of-kathy-morris/"));
	}

	@Test
	public void test2() throws IOException {
		Map<String, String> map = Maps.newHashMap();

		// Document doc =
		// Jsoup.connect("http://www.xiami.com/member/login").data(data).get();
		// System.out.println(doc.html());
	}

	public void test3() {
		Set<Integer> s = Sets.newHashSet();
		List<Integer> ss = Lists.newArrayList();

		pull(s);
		pull(ss);

		System.out.println(s);
		System.out.println(ss);
	}

	private void pull(Collection<Integer> s) {
		s.add(1);
		s.add(1);
	}
}
