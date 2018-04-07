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
import com.tools20022.repository.codeset.CashMarginOrderCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies whether an order is a non-margin, an opening margin or a closing
 * margin order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CashMarginOrderCode#Cash
 * CashMarginOrderCode.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode#MarginOpen
 * CashMarginOrderCode.MarginOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode#MarginClose
 * CashMarginOrderCode.MarginClose}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 544</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashMarginOrderCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether an order is a non-margin, an opening margin or a closing margin order."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashMarginOrderCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The principal owns the cash in case of a purchase, or the securities in
	 * case of a sale so the execution, if it occurs, will not generate any
	 * margin account opening or margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode
	 * CashMarginOrderCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The principal owns the cash in case of a purchase, or the securities in case of a sale so the execution, if it occurs, will not generate any margin account opening or margin call."
	 * </li>
	 * </ul>
	 */
	public static final CashMarginOrderCode Cash = new CashMarginOrderCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "The principal owns the cash in case of a purchase, or the securities in case of a sale so the execution, if it occurs, will not generate any margin account opening or margin call.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashMarginOrderCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * The principal order, if executed, will generate a margin account opening
	 * or margin call because the principal does not have the cash in case of a
	 * purchase or the securities in case of a sale.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode
	 * CashMarginOrderCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginOpen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The principal order, if executed, will generate a margin account opening or margin call because the principal does not have the cash in case of a purchase or the securities in case of a sale."
	 * </li>
	 * </ul>
	 */
	public static final CashMarginOrderCode MarginOpen = new CashMarginOrderCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginOpen";
			definition = "The principal order, if executed, will generate a margin account opening or margin call because the principal does not have the cash in case of a purchase or the securities in case of a sale.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashMarginOrderCode.mmObject();
			codeName = "MRGO";
		}
	};
	/**
	 * The principal order, if executed, will enable the margin position to be
	 * closed and the positions to be covered (for example: purchase of
	 * securities that have previously been short-sold, or sale of securities
	 * that have been bought on margin).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashMarginOrderCode
	 * CashMarginOrderCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The principal order, if executed, will enable the margin position to be closed and the positions to be covered (for example: purchase of securities that have previously been short-sold, or sale of securities that have been bought on margin)."
	 * </li>
	 * </ul>
	 */
	public static final CashMarginOrderCode MarginClose = new CashMarginOrderCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginClose";
			definition = "The principal order, if executed, will enable the margin position to be closed and the positions to be covered (for example: purchase of securities that have previously been short-sold, or sale of securities that have been bought on margin).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashMarginOrderCode.mmObject();
			codeName = "MRGC";
		}
	};
	final static private LinkedHashMap<String, CashMarginOrderCode> codesByName = new LinkedHashMap<>();

	protected CashMarginOrderCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "544"));
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashMarginOrderCode";
				definition = "Identifies whether an order is a non-margin, an opening margin or a closing margin order.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.CashMarginOrderCode.Cash, com.tools20022.repository.codeset.CashMarginOrderCode.MarginOpen, com.tools20022.repository.codeset.CashMarginOrderCode.MarginClose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(MarginOpen.getCodeName().get(), MarginOpen);
		codesByName.put(MarginClose.getCodeName().get(), MarginClose);
	}

	public static CashMarginOrderCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashMarginOrderCode[] values() {
		CashMarginOrderCode[] values = new CashMarginOrderCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashMarginOrderCode> {
		@Override
		public CashMarginOrderCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashMarginOrderCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}