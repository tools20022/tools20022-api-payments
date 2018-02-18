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
import com.tools20022.repository.codeset.CashSettlementSystemCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the cash settlement system used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#BankOfKoreaWire
 * CashSettlementSystemCode.BankOfKoreaWire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#Cheque
 * CashSettlementSystemCode.Cheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#UKDomestic
 * CashSettlementSystemCode.UKDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#GrossSettlementSystem
 * CashSettlementSystemCode.GrossSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#NetSettlementSystem
 * CashSettlementSystemCode.NetSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#USChips
 * CashSettlementSystemCode.USChips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode#FedWireUS
 * CashSettlementSystemCode.FedWireUS}</li>
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
 * <li>"BOKW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashSettlementSystemCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash settlement system used."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashSettlementSystemCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settle money through Bank of Korea Wire.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOKW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOfKoreaWire"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through Bank of Korea Wire."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode BankOfKoreaWire = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfKoreaWire";
			definition = "Settle money through Bank of Korea Wire.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "BOKW";
		}
	};
	/**
	 * Settle money through cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through cheque."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode Cheque = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			definition = "Settle money through cheque.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "CHEC";
		}
	};
	/**
	 * Settle money through UK domestic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through UK domestic."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode UKDomestic = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomestic";
			definition = "Settle money through UK domestic.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "GBSC";
		}
	};
	/**
	 * Settle money through gross settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through gross settlement system."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode GrossSettlementSystem = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossSettlementSystem";
			definition = "Settle money through gross settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Settle money through net settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through net settlement system."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode NetSettlementSystem = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSettlementSystem";
			definition = "Settle money through net settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "NETS";
		}
	};
	/**
	 * Settle money through CHIPS (US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USChips"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through CHIPS (US)."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode USChips = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USChips";
			definition = "Settle money through CHIPS (US).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "USCH";
		}
	};
	/**
	 * Settle money through Fedwire (US).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashSettlementSystemCode
	 * CashSettlementSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedWireUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settle money through Fedwire (US)."</li>
	 * </ul>
	 */
	public static final CashSettlementSystemCode FedWireUS = new CashSettlementSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedWireUS";
			definition = "Settle money through Fedwire (US).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashSettlementSystemCode.mmObject();
			codeName = "USFW";
		}
	};
	final static private LinkedHashMap<String, CashSettlementSystemCode> codesByName = new LinkedHashMap<>();

	protected CashSettlementSystemCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOKW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashSettlementSystemCode";
				definition = "Specifies the cash settlement system used.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashSettlementSystemCode.BankOfKoreaWire, com.tools20022.repository.codeset.CashSettlementSystemCode.Cheque,
						com.tools20022.repository.codeset.CashSettlementSystemCode.UKDomestic, com.tools20022.repository.codeset.CashSettlementSystemCode.GrossSettlementSystem,
						com.tools20022.repository.codeset.CashSettlementSystemCode.NetSettlementSystem, com.tools20022.repository.codeset.CashSettlementSystemCode.USChips,
						com.tools20022.repository.codeset.CashSettlementSystemCode.FedWireUS);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BankOfKoreaWire.getCodeName().get(), BankOfKoreaWire);
		codesByName.put(Cheque.getCodeName().get(), Cheque);
		codesByName.put(UKDomestic.getCodeName().get(), UKDomestic);
		codesByName.put(GrossSettlementSystem.getCodeName().get(), GrossSettlementSystem);
		codesByName.put(NetSettlementSystem.getCodeName().get(), NetSettlementSystem);
		codesByName.put(USChips.getCodeName().get(), USChips);
		codesByName.put(FedWireUS.getCodeName().get(), FedWireUS);
	}

	public static CashSettlementSystemCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashSettlementSystemCode[] values() {
		CashSettlementSystemCode[] values = new CashSettlementSystemCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashSettlementSystemCode> {
		@Override
		public CashSettlementSystemCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashSettlementSystemCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}