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
import com.tools20022.repository.codeset.FreightChargesCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the arrangement as to the freight charges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FreightChargesCode#Collect
 * FreightChargesCode.Collect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FreightChargesCode#Prepaid
 * FreightChargesCode.Prepaid}</li>
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
 * <li>"CLCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FreightChargesCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the arrangement as to the freight charges."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FreightChargesCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Freight charges are to collect from consignee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FreightChargesCode
	 * FreightChargesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Freight charges are to collect from consignee."</li>
	 * </ul>
	 */
	public static final FreightChargesCode Collect = new FreightChargesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collect";
			definition = "Freight charges are to collect from consignee.";
			owner_lazy = () -> com.tools20022.repository.codeset.FreightChargesCode.mmObject();
			codeName = "CLCT";
		}
	};
	/**
	 * Freight charges are paid by shipper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FreightChargesCode
	 * FreightChargesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prepaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Freight charges are paid by shipper."</li>
	 * </ul>
	 */
	public static final FreightChargesCode Prepaid = new FreightChargesCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Prepaid";
			definition = "Freight charges are paid by shipper.";
			owner_lazy = () -> com.tools20022.repository.codeset.FreightChargesCode.mmObject();
			codeName = "PRPD";
		}
	};
	final static private LinkedHashMap<String, FreightChargesCode> codesByName = new LinkedHashMap<>();

	protected FreightChargesCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FreightChargesCode";
				definition = "Indicates the arrangement as to the freight charges.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FreightChargesCode.Collect, com.tools20022.repository.codeset.FreightChargesCode.Prepaid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Collect.getCodeName().get(), Collect);
		codesByName.put(Prepaid.getCodeName().get(), Prepaid);
	}

	public static FreightChargesCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FreightChargesCode[] values() {
		FreightChargesCode[] values = new FreightChargesCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FreightChargesCode> {
		@Override
		public FreightChargesCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FreightChargesCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}