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
import com.tools20022.repository.codeset.AccountUsageTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of usage of the account
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode#Investor
 * AccountUsageTypeCode.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode#SettlementParticipant
 * AccountUsageTypeCode.mmSettlementParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode#TradingParticipant
 * AccountUsageTypeCode.mmTradingParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode#IssuingParticipant
 * AccountUsageTypeCode.mmIssuingParticipant}</li>
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
 * <li>"INVE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountUsageTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of usage of the account"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountUsageTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor."</li>
	 * </ul>
	 */
	public static final AccountUsageTypeCode Investor = new AccountUsageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageTypeCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Settlement participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement participant."</li>
	 * </ul>
	 */
	public static final AccountUsageTypeCode SettlementParticipant = new AccountUsageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParticipant";
			definition = "Settlement participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageTypeCode.mmObject();
			codeName = "SETP";
		}
	};
	/**
	 * Trading participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading participant."</li>
	 * </ul>
	 */
	public static final AccountUsageTypeCode TradingParticipant = new AccountUsageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingParticipant";
			definition = "Trading participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageTypeCode.mmObject();
			codeName = "TRDP";
		}
	};
	/**
	 * Issuing participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
	 * AccountUsageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuing participant."</li>
	 * </ul>
	 */
	public static final AccountUsageTypeCode IssuingParticipant = new AccountUsageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuingParticipant";
			definition = "Issuing participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageTypeCode.mmObject();
			codeName = "ISSP";
		}
	};
	final static private LinkedHashMap<String, AccountUsageTypeCode> codesByName = new LinkedHashMap<>();

	protected AccountUsageTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("INVE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountUsageTypeCode";
				definition = "Specifies the type of usage of the account";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountUsageTypeCode.Investor, com.tools20022.repository.codeset.AccountUsageTypeCode.SettlementParticipant,
						com.tools20022.repository.codeset.AccountUsageTypeCode.TradingParticipant, com.tools20022.repository.codeset.AccountUsageTypeCode.IssuingParticipant);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(SettlementParticipant.getCodeName().get(), SettlementParticipant);
		codesByName.put(TradingParticipant.getCodeName().get(), TradingParticipant);
		codesByName.put(IssuingParticipant.getCodeName().get(), IssuingParticipant);
	}

	public static AccountUsageTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountUsageTypeCode[] values() {
		AccountUsageTypeCode[] values = new AccountUsageTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountUsageTypeCode> {
		@Override
		public AccountUsageTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountUsageTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}