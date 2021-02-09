package com.gourabix.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class DomainSafetyCheckPredicate {

	public static void main(String[] args) {
		List<Domain> domains = Arrays.asList(new Domain("google.com", 1), new Domain("i-am-spammer.com", 10),
				new Domain("mkyong.com", 0), new Domain("microsoft.com", 2), new Domain("gourabix.com", 0),
				new Domain("sush.love", 99));

		BiPredicate<String, Integer> biPredicateGoogle = (domainName,
				threatScore) -> (domainName.equalsIgnoreCase("google.com") || threatScore < 1);
		System.out.println(filterBadDomain(domains, biPredicateGoogle));

		BiPredicate<String, Integer> biPredicatePersonal = (domainName,
				threatScore) -> (domainName.equalsIgnoreCase("gourabix.com"));
		System.out.println(filterBadDomain(domains, biPredicatePersonal));

		BiPredicate<String, Integer> biPredicateInsecure = (domainName,
				threatScore) -> (domainName.startsWith("i") && threatScore > 1);
		System.out.println(filterBadDomain(domains, biPredicateInsecure));

		List<Domain> loveDomain = filterBadDomain(domains,
				(domainName, threatScore) -> (domainName.startsWith("sush") && threatScore == 99));
		System.out.println(loveDomain);

		// BiPredicate chaining
		List<Domain> chainedFilterDomain = filterBadDomain(domains,
				biPredicatePersonal.or((domainName, threatScore) -> (threatScore > 3)));
		System.out.println(chainedFilterDomain);
	}

	public static <T extends Domain> List<T> filterBadDomain(List<T> domains,
			BiPredicate<String, Integer> biPredicate) {
		return domains.stream().filter(domain -> biPredicate.test(domain.getName(), domain.getScore()))
				.collect(Collectors.toList());
	}

}
