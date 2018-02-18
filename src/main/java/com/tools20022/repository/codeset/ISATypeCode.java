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
import com.tools20022.repository.codeset.ISATypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the current year ISA.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ISATypeCode#MiniEquity
 * ISATypeCode.MiniEquity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ISATypeCode#Maxi
 * ISATypeCode.Maxi}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ISATypeCode#MiniCash
 * ISATypeCode.MiniCash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ISATypeCode#Any
 * ISATypeCode.Any}</li>
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
 * <li>"MINE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISATypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the current year ISA."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ISATypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of ISA that offers a stocks and shares component only (no cash).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISATypeCode ISATypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of ISA that offers a stocks and shares component only (no cash)."</li>
	 * </ul>
	 */
	public static final ISATypeCode MiniEquity = new ISATypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiniEquity";
			definition = "Type of ISA that offers a stocks and shares component only (no cash).";
			owner_lazy = () -> com.tools20022.repository.codeset.ISATypeCode.mmObject();
			codeName = "MINE";
		}
	};
	/**
	 * Type of ISA that must offer a stocks and shares component and,
	 * optionally, a cash component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISATypeCode ISATypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAXI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maxi"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of ISA that must offer a stocks and shares component and, optionally, a cash component."
	 * </li>
	 * </ul>
	 */
	public static final ISATypeCode Maxi = new ISATypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Maxi";
			definition = "Type of ISA that must offer a stocks and shares component and, optionally, a cash component.";
			owner_lazy = () -> com.tools20022.repository.codeset.ISATypeCode.mmObject();
			codeName = "MAXI";
		}
	};
	/**
	 * Type of ISA that offers a cash component only (no stock).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISATypeCode ISATypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of ISA that offers a cash component only (no stock)."
	 * </li>
	 * </ul>
	 */
	public static final ISATypeCode MiniCash = new ISATypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiniCash";
			definition = "Type of ISA that offers a cash component only (no stock).";
			owner_lazy = () -> com.tools20022.repository.codeset.ISATypeCode.mmObject();
			codeName = "MINC";
		}
	};
	/**
	 * Any ISA.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISATypeCode ISATypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Any"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Any ISA."</li>
	 * </ul>
	 */
	public static final ISATypeCode Any = new ISATypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Any";
			definition = "Any ISA.";
			owner_lazy = () -> com.tools20022.repository.codeset.ISATypeCode.mmObject();
			codeName = "ANYI";
		}
	};
	final static private LinkedHashMap<String, ISATypeCode> codesByName = new LinkedHashMap<>();

	protected ISATypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MINE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATypeCode";
				definition = "Specifies the type of the current year ISA.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ISATypeCode.MiniEquity, com.tools20022.repository.codeset.ISATypeCode.Maxi, com.tools20022.repository.codeset.ISATypeCode.MiniCash,
						com.tools20022.repository.codeset.ISATypeCode.Any);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MiniEquity.getCodeName().get(), MiniEquity);
		codesByName.put(Maxi.getCodeName().get(), Maxi);
		codesByName.put(MiniCash.getCodeName().get(), MiniCash);
		codesByName.put(Any.getCodeName().get(), Any);
	}

	public static ISATypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ISATypeCode[] values() {
		ISATypeCode[] values = new ISATypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ISATypeCode> {
		@Override
		public ISATypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ISATypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}