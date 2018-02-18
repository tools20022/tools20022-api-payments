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
import com.tools20022.repository.codeset.ClearingChannelCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the clearing channel for the routing of the transaction, as part of
 * the payment type identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode#RealTimeGrossSettlementSystem
 * ClearingChannelCode.RealTimeGrossSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode#RealTimeNetSettlementSystem
 * ClearingChannelCode.RealTimeNetSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode#MassPaymentNetSystem
 * ClearingChannelCode.MassPaymentNetSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode#BookTransfer
 * ClearingChannelCode.BookTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ClearingChannel2Code
 * ClearingChannel2Code}</li>
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
 * <li>"RTGS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingChannelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingChannelCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Clearing channel is a real-time gross settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealTimeGrossSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing channel is a real-time gross settlement system."</li>
	 * </ul>
	 */
	public static final ClearingChannelCode RealTimeGrossSettlementSystem = new ClearingChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RealTimeGrossSettlementSystem";
			definition = "Clearing channel is a real-time gross settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingChannelCode.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Clearing channel is a real-time net settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealTimeNetSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing channel is a real-time net settlement system."</li>
	 * </ul>
	 */
	public static final ClearingChannelCode RealTimeNetSettlementSystem = new ClearingChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RealTimeNetSettlementSystem";
			definition = "Clearing channel is a real-time net settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingChannelCode.mmObject();
			codeName = "RTNS";
		}
	};
	/**
	 * Clearing channel is a mass payment net settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MassPaymentNetSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing channel is a mass payment net settlement system."
	 * </li>
	 * </ul>
	 */
	public static final ClearingChannelCode MassPaymentNetSystem = new ClearingChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MassPaymentNetSystem";
			definition = "Clearing channel is a mass payment net settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingChannelCode.mmObject();
			codeName = "MPNS";
		}
	};
	/**
	 * Payment through internal book transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingChannelCode
	 * ClearingChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment through internal book transfer."</li>
	 * </ul>
	 */
	public static final ClearingChannelCode BookTransfer = new ClearingChannelCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BookTransfer";
			definition = "Payment through internal book transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingChannelCode.mmObject();
			codeName = "BOOK";
		}
	};
	final static private LinkedHashMap<String, ClearingChannelCode> codesByName = new LinkedHashMap<>();

	protected ClearingChannelCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RTGS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingChannelCode";
				definition = "Specifies the clearing channel for the routing of the transaction, as part of the payment type identification.";
				derivation_lazy = () -> Arrays.asList(ClearingChannel2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingChannelCode.RealTimeGrossSettlementSystem, com.tools20022.repository.codeset.ClearingChannelCode.RealTimeNetSettlementSystem,
						com.tools20022.repository.codeset.ClearingChannelCode.MassPaymentNetSystem, com.tools20022.repository.codeset.ClearingChannelCode.BookTransfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RealTimeGrossSettlementSystem.getCodeName().get(), RealTimeGrossSettlementSystem);
		codesByName.put(RealTimeNetSettlementSystem.getCodeName().get(), RealTimeNetSettlementSystem);
		codesByName.put(MassPaymentNetSystem.getCodeName().get(), MassPaymentNetSystem);
		codesByName.put(BookTransfer.getCodeName().get(), BookTransfer);
	}

	public static ClearingChannelCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingChannelCode[] values() {
		ClearingChannelCode[] values = new ClearingChannelCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingChannelCode> {
		@Override
		public ClearingChannelCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingChannelCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}