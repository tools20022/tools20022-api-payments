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

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AmountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why an amount is not specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountTypeCode#Open
 * AmountTypeCode.mmOpen}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountTypeCode#Unknown
 * AmountTypeCode.mmUnknown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountTypeCode#FixedAmount
 * AmountTypeCode.mmFixedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode#MinimumAmount
 * AmountTypeCode.mmMinimumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode#MaximumAmount
 * AmountTypeCode.mmMaximumAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why an amount is not specified."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AmountTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The amount is open.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode
	 * AmountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The amount is open."</li>
	 * </ul>
	 */
	public static final AmountTypeCode Open = new AmountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "The amount is open.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * The amount is unkown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode
	 * AmountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The amount is unkown."</li>
	 * </ul>
	 */
	public static final AmountTypeCode Unknown = new AmountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "The amount is unkown.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * The amount represents a fixed value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode
	 * AmountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIXD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The amount represents a fixed value."</li>
	 * </ul>
	 */
	public static final AmountTypeCode FixedAmount = new AmountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedAmount";
			definition = "The amount represents a fixed value.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountTypeCode.mmObject();
			codeName = "FIXD";
		}
	};
	/**
	 * The amount represents the minimum value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode
	 * AmountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The amount represents the minimum value."</li>
	 * </ul>
	 */
	public static final AmountTypeCode MinimumAmount = new AmountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAmount";
			definition = "The amount represents the minimum value.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountTypeCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * The amount represents the maximum value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountTypeCode
	 * AmountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The amount represents the maximum value."</li>
	 * </ul>
	 */
	public static final AmountTypeCode MaximumAmount = new AmountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "The amount represents the maximum value.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountTypeCode.mmObject();
			codeName = "MAXI";
		}
	};
	final static private LinkedHashMap<String, AmountTypeCode> codesByName = new LinkedHashMap<>();

	protected AmountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountTypeCode";
				definition = "Specifies the reason why an amount is not specified.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountTypeCode.Open, com.tools20022.repository.codeset.AmountTypeCode.Unknown, com.tools20022.repository.codeset.AmountTypeCode.FixedAmount,
						com.tools20022.repository.codeset.AmountTypeCode.MinimumAmount, com.tools20022.repository.codeset.AmountTypeCode.MaximumAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(FixedAmount.getCodeName().get(), FixedAmount);
		codesByName.put(MinimumAmount.getCodeName().get(), MinimumAmount);
		codesByName.put(MaximumAmount.getCodeName().get(), MaximumAmount);
	}

	public static AmountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AmountTypeCode[] values() {
		AmountTypeCode[] values = new AmountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AmountTypeCode> {
		@Override
		public AmountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AmountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}