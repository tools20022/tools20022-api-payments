/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BasisPriceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Basis price type in a bid order. Used for list trading.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#MorningSessionClosePrice
 * BasisPriceTypeCode.MorningSessionClosePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#ClosingPrice
 * BasisPriceTypeCode.ClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#CurrentPrice
 * BasisPriceTypeCode.CurrentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#SpecialQuotation
 * BasisPriceTypeCode.SpecialQuotation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#VWAPDay
 * BasisPriceTypeCode.VWAPDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#VWAPMorning
 * BasisPriceTypeCode.VWAPMorning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#VWAPAfternoon
 * BasisPriceTypeCode.VWAPAfternoon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#StrikePrice
 * BasisPriceTypeCode.StrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode#OpenPrice
 * BasisPriceTypeCode.OpenPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 419</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MSCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BasisPriceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Basis price type in a bid order. Used for list trading."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BasisPriceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Closing price at morning session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MorningSessionClosePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing price at morning session."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode MorningSessionClosePrice = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MorningSessionClosePrice";
			definition = "Closing price at morning session.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "MSCP";
		}
	};
	/**
	 * Closing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing price."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode ClosingPrice = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingPrice";
			definition = "Closing price.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Current price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current price."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode CurrentPrice = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentPrice";
			definition = "Current price.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Price computed after a trading halt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPQO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialQuotation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price computed after a trading halt."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode SpecialQuotation = new BasisPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialQuotation";
			definition = "Price computed after a trading halt.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "SPQO";
		}
	};
	/**
	 * Value weighted average price through the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value weighted average price through the day."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode VWAPDay = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPDay";
			definition = "Value weighted average price through the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "VWPD";
		}
	};
	/**
	 * Value weighted average price through a morning session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPMorning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value weighted average price through a morning session."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode VWAPMorning = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPMorning";
			definition = "Value weighted average price through a morning session.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "VWPM";
		}
	};
	/**
	 * Value weighted average price through an afternoon session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPAfternoon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value weighted average price through an afternoon session."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode VWAPAfternoon = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPAfternoon";
			definition = "Value weighted average price through an afternoon session.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "VWPA";
		}
	};
	/**
	 * Exercise price defined on a derivative product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exercise price defined on a derivative product."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode StrikePrice = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Exercise price defined on a derivative product.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "STIK";
		}
	};
	/**
	 * Price of a trade opening session.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
	 * BasisPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 419</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of a trade opening session."</li>
	 * </ul>
	 */
	public static final BasisPriceTypeCode OpenPrice = new BasisPriceTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenPrice";
			definition = "Price of a trade opening session.";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	final static private LinkedHashMap<String, BasisPriceTypeCode> codesByName = new LinkedHashMap<>();

	protected BasisPriceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "419"));
				example = Arrays.asList("MSCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BasisPriceTypeCode";
				definition = "Basis price type in a bid order. Used for list trading.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BasisPriceTypeCode.MorningSessionClosePrice, com.tools20022.repository.codeset.BasisPriceTypeCode.ClosingPrice,
						com.tools20022.repository.codeset.BasisPriceTypeCode.CurrentPrice, com.tools20022.repository.codeset.BasisPriceTypeCode.SpecialQuotation, com.tools20022.repository.codeset.BasisPriceTypeCode.VWAPDay,
						com.tools20022.repository.codeset.BasisPriceTypeCode.VWAPMorning, com.tools20022.repository.codeset.BasisPriceTypeCode.VWAPAfternoon, com.tools20022.repository.codeset.BasisPriceTypeCode.StrikePrice,
						com.tools20022.repository.codeset.BasisPriceTypeCode.OpenPrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MorningSessionClosePrice.getCodeName().get(), MorningSessionClosePrice);
		codesByName.put(ClosingPrice.getCodeName().get(), ClosingPrice);
		codesByName.put(CurrentPrice.getCodeName().get(), CurrentPrice);
		codesByName.put(SpecialQuotation.getCodeName().get(), SpecialQuotation);
		codesByName.put(VWAPDay.getCodeName().get(), VWAPDay);
		codesByName.put(VWAPMorning.getCodeName().get(), VWAPMorning);
		codesByName.put(VWAPAfternoon.getCodeName().get(), VWAPAfternoon);
		codesByName.put(StrikePrice.getCodeName().get(), StrikePrice);
		codesByName.put(OpenPrice.getCodeName().get(), OpenPrice);
	}

	public static BasisPriceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BasisPriceTypeCode[] values() {
		BasisPriceTypeCode[] values = new BasisPriceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BasisPriceTypeCode> {
		@Override
		public BasisPriceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BasisPriceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}