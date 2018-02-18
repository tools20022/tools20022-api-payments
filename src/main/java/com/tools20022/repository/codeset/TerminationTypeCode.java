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
import com.tools20022.repository.codeset.TerminationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the timing or method for terminating the agreement - for repos.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode#Overnight
 * TerminationTypeCode.Overnight}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TerminationTypeCode#Term
 * TerminationTypeCode.Term}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode#Flexible
 * TerminationTypeCode.Flexible}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TerminationTypeCode#Open
 * TerminationTypeCode.Open}</li>
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
 * <li>"OVER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the timing or method for terminating the agreement - for repos."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Repo with a term of one day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode
	 * TerminationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overnight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repo with a term of one day."</li>
	 * </ul>
	 */
	public static final TerminationTypeCode Overnight = new TerminationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overnight";
			definition = "Repo with a term of one day.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationTypeCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Repo with a term of more than one day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode
	 * TerminationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repo with a term of more than one day."</li>
	 * </ul>
	 */
	public static final TerminationTypeCode Term = new TerminationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Term";
			definition = "Repo with a term of more than one day.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Identifies
	 * "a classic term repo with the added feature that the cash is repaid to the buyer in installments"
	 * (Definition from "Mastering Repo Markets" by Bob Steiner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode
	 * TerminationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flexible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies \"a classic term repo with the added feature that the cash is repaid to the buyer in installments\" (Definition from \"Mastering Repo Markets\" by Bob Steiner)."
	 * </li>
	 * </ul>
	 */
	public static final TerminationTypeCode Flexible = new TerminationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Flexible";
			definition = "Identifies \"a classic term repo with the added feature that the cash is repaid to the buyer in installments\" (Definition from \"Mastering Repo Markets\" by Bob Steiner).";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationTypeCode.mmObject();
			codeName = "FLEX";
		}
	};
	/**
	 * Repo which can be terminated by either party at any time, and which has
	 * an unspecified repurchase date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode
	 * TerminationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repo which can be terminated by either party at any time, and which has an unspecified repurchase date."
	 * </li>
	 * </ul>
	 */
	public static final TerminationTypeCode Open = new TerminationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			definition = "Repo which can be terminated by either party at any time, and which has an unspecified repurchase date.";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminationTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	final static private LinkedHashMap<String, TerminationTypeCode> codesByName = new LinkedHashMap<>();

	protected TerminationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminationTypeCode";
				definition = "Specifies the timing or method for terminating the agreement - for repos.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminationTypeCode.Overnight, com.tools20022.repository.codeset.TerminationTypeCode.Term, com.tools20022.repository.codeset.TerminationTypeCode.Flexible,
						com.tools20022.repository.codeset.TerminationTypeCode.Open);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Overnight.getCodeName().get(), Overnight);
		codesByName.put(Term.getCodeName().get(), Term);
		codesByName.put(Flexible.getCodeName().get(), Flexible);
		codesByName.put(Open.getCodeName().get(), Open);
	}

	public static TerminationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminationTypeCode[] values() {
		TerminationTypeCode[] values = new TerminationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminationTypeCode> {
		@Override
		public TerminationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}