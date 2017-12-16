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
import com.tools20022.repository.codeset.DeliveryReceiptTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the transaction is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode#SeparateSettlement
 * DeliveryReceiptTypeCode.mmSeparateSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode#AgainstPaymentSettlement
 * DeliveryReceiptTypeCode.mmAgainstPaymentSettlement}</li>
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
 * <li>"FREE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryReceiptTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how the transaction is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeliveryReceiptTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement of the financial instrument and cash is separate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode
	 * DeliveryReceiptTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeparateSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of the financial instrument and cash is separate."</li>
	 * </ul>
	 */
	public static final DeliveryReceiptTypeCode SeparateSettlement = new DeliveryReceiptTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SeparateSettlement";
			definition = "Settlement of the financial instrument and cash is separate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptTypeCode.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Settlement of the financial instrument and cash takes place in a delivery
	 * versus payment (DVP) environment, ie, through an International Central
	 * Securities Depository (ICSD) or Central Securities Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode
	 * DeliveryReceiptTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPaymentSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of the financial instrument and cash takes place in a delivery versus payment (DVP) environment, ie, through an International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final DeliveryReceiptTypeCode AgainstPaymentSettlement = new DeliveryReceiptTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgainstPaymentSettlement";
			definition = "Settlement of the financial instrument and cash takes place in a delivery versus payment (DVP) environment, ie, through an International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			owner_lazy = () -> com.tools20022.repository.codeset.DeliveryReceiptTypeCode.mmObject();
			codeName = "APMT";
		}
	};
	final static private LinkedHashMap<String, DeliveryReceiptTypeCode> codesByName = new LinkedHashMap<>();

	protected DeliveryReceiptTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FREE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryReceiptTypeCode";
				definition = "Specifies how the transaction is to be settled.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReceiptTypeCode.SeparateSettlement, com.tools20022.repository.codeset.DeliveryReceiptTypeCode.AgainstPaymentSettlement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SeparateSettlement.getCodeName().get(), SeparateSettlement);
		codesByName.put(AgainstPaymentSettlement.getCodeName().get(), AgainstPaymentSettlement);
	}

	public static DeliveryReceiptTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeliveryReceiptTypeCode[] values() {
		DeliveryReceiptTypeCode[] values = new DeliveryReceiptTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeliveryReceiptTypeCode> {
		@Override
		public DeliveryReceiptTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeliveryReceiptTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}