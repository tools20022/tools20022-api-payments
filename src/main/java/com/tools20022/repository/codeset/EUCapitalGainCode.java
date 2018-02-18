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
import com.tools20022.repository.codeset.EUCapitalGainCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether capital gain is in the scope of the European directive on
 * taxation of savings income in the form of interest payments (Council
 * Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or
 * redemption of shares and units etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode#CapitalGainInScope
 * EUCapitalGainCode.CapitalGainInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode#CapitalGainOutScope
 * EUCapitalGainCode.CapitalGainOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode#CapitalGainUnknown
 * EUCapitalGainCode.CapitalGainUnknown}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EUCapitalGainCode#Other
 * EUCapitalGainCode.Other}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EUSI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUCapitalGainCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or redemption of shares and units etc."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EUCapitalGainCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Capital gain is in the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainInScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capital gain is in the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUCapitalGainCode CapitalGainInScope = new EUCapitalGainCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainInScope";
			definition = "Capital gain is in the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGainCode.mmObject();
			codeName = "EUSI";
		}
	};
	/**
	 * Capital gain is out of the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUSO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainOutScope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capital gain is out of the scope of the directive."</li>
	 * </ul>
	 */
	public static final EUCapitalGainCode CapitalGainOutScope = new EUCapitalGainCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainOutScope";
			definition = "Capital gain is out of the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGainCode.mmObject();
			codeName = "EUSO";
		}
	};
	/**
	 * Unknown whether capital gain is in or out of the scope of the directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unknown whether capital gain is in or out of the scope of the directive."
	 * </li>
	 * </ul>
	 */
	public static final EUCapitalGainCode CapitalGainUnknown = new EUCapitalGainCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalGainUnknown";
			definition = "Unknown whether capital gain is in or out of the scope of the directive.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGainCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Another type of EU capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type of EU capital gain."</li>
	 * </ul>
	 */
	public static final EUCapitalGainCode Other = new EUCapitalGainCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of EU capital gain.";
			owner_lazy = () -> com.tools20022.repository.codeset.EUCapitalGainCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, EUCapitalGainCode> codesByName = new LinkedHashMap<>();

	protected EUCapitalGainCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EUCapitalGainCode";
				definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June) for an income realised upon sale, a refund or redemption of shares and units etc.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUCapitalGainCode.CapitalGainInScope, com.tools20022.repository.codeset.EUCapitalGainCode.CapitalGainOutScope,
						com.tools20022.repository.codeset.EUCapitalGainCode.CapitalGainUnknown, com.tools20022.repository.codeset.EUCapitalGainCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalGainInScope.getCodeName().get(), CapitalGainInScope);
		codesByName.put(CapitalGainOutScope.getCodeName().get(), CapitalGainOutScope);
		codesByName.put(CapitalGainUnknown.getCodeName().get(), CapitalGainUnknown);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static EUCapitalGainCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EUCapitalGainCode[] values() {
		EUCapitalGainCode[] values = new EUCapitalGainCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EUCapitalGainCode> {
		@Override
		public EUCapitalGainCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EUCapitalGainCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}